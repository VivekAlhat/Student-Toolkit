package com.example.studenttoolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Temperature extends AppCompatActivity {

    EditText etNumber;
    Button btncToF, btnfToC;
    TextView tvResult;
    double generatedTemp;
    DecimalFormat tempCF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        etNumber = findViewById(R.id.etNumber);
        btncToF = findViewById(R.id.btncToF);
        btnfToC = findViewById(R.id.btnfToC);
        tvResult = findViewById(R.id.tvResult);

        tempCF = new DecimalFormat("#,###,##0.00");

        tvResult.setVisibility(View.GONE);

        btncToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etNumber.getText().toString().isEmpty()){

                    Toast.makeText(Temperature.this, "Please enter Temperature", Toast.LENGTH_SHORT).show();
                    tvResult.setVisibility(View.GONE);

                }
                else{

                    double enteredTemp = Double.parseDouble(etNumber.getText().toString());
                    generatedTemp = (enteredTemp * 1.8) + 32 ;

                    tvResult.setText("Result : "+tempCF.format(generatedTemp)+" °F");
                    tvResult.setVisibility(View.VISIBLE);

                }
            }
        });

        btnfToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etNumber.getText().toString().isEmpty()){

                    Toast.makeText(Temperature.this, "Please enter Temperature", Toast.LENGTH_SHORT).show();
                    tvResult.setVisibility(View.GONE);
                }
                else{

                    double enteredTemp = Double.parseDouble(etNumber.getText().toString());
                    generatedTemp = (enteredTemp - 32) / 1.8 ;

                    tvResult.setText("Result : "+tempCF.format(generatedTemp)+" °C");
                    tvResult.setVisibility(View.VISIBLE);

                }
            }
        });
    }
}
