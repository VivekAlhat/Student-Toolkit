package com.example.studenttoolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Unit extends AppCompatActivity {

    Spinner spconvertFromUnitType;
    Spinner spconvertToUnitType;
    Button btnConvertUnit;
    EditText etQuantity;
    TextView tvUnitResult;

    //variables for Storing selected type
    String SelectedFrom;
    String SelectedTo;


    //this array is for the spinner times(the unit types of selection)
    //it is also arranged in alphabetical order
    String [] unitTypes = {"centimeter", "feet", "inch", "kilometer", "meter", "mile", "millimeter", "yard"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit);

        //set spinner variables to corresponding spinner components
        spconvertFromUnitType = findViewById(R.id.spConvertFromType);
        spconvertToUnitType = findViewById(R.id.spConvertToUnitType);
        btnConvertUnit = findViewById(R.id.btnConvertSz);

        etQuantity = findViewById(R.id.etQuantity);
        tvUnitResult = findViewById(R.id.tvUnitResult);


        //new Code :
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(Unit.this, android.R.layout.simple_spinner_item, unitTypes);

        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //


        //now set the adapter to the spinners
        spconvertFromUnitType.setAdapter(spinnerAdapter);
        spconvertToUnitType.setAdapter(spinnerAdapter);

        tvUnitResult.setVisibility(View.GONE);

        spconvertFromUnitType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SelectedFrom = parent.getItemAtPosition(position).toString();

                //Toast.makeText(Unit.this, "Selected Unit From : "+SelectedFrom, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spconvertToUnitType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SelectedTo = parent.getItemAtPosition(position).toString();

                //Toast.makeText(Unit.this, "Selected Unit To : "+SelectedTo, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btnConvertUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //declare variables
                double beginningQty;
                double finalEndingQty;
                String beginningUnitType;
                String endingUnitType;

                //declare components

                //create object for length conversion
                LengthConversion lengthConverter = new LengthConversion();

                //check that the quantity fields has been entered
                if ( !(etQuantity.getText().toString().isEmpty()) ){

                    //get input user data from fields
                    beginningQty = Double.parseDouble(etQuantity.getText().toString().trim());
                    beginningUnitType = SelectedFrom.trim();
                    endingUnitType = SelectedTo.trim();

                    //input data into object
                    lengthConverter.setBeginningQty(beginningQty);
                    lengthConverter.setBeginningUnitType(beginningUnitType);
                    lengthConverter.setEndingUnitType(endingUnitType);

                    //calculate the conversion result
                    finalEndingQty = lengthConverter.calculateEndingQty();
                    lengthConverter.setEndingQty(finalEndingQty);

                    //output the conversion result to console
                    tvUnitResult.setText(lengthConverter.toString());
                    tvUnitResult.setVisibility(View.VISIBLE);

                }
                else{

                    //create a toast message to enter quantity
                    Toast.makeText(Unit.this, "Please enter the Quantity", Toast.LENGTH_SHORT).show();

                    tvUnitResult.setVisibility(View.GONE);
                }

            }
        });
    }

}
