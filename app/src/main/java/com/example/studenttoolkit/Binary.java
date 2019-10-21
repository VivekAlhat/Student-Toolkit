package com.example.studenttoolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import static android.text.InputType.TYPE_CLASS_NUMBER;
import static android.text.InputType.TYPE_CLASS_TEXT;
import static android.text.InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS;


public class Binary extends AppCompatActivity {

    EditText etNumberValue;
    Spinner spConvertFromType;
    TextView tvDecimal, tvBinary, tvOctal, tvHexa;
    TextView tvDecimalForm, tvBinaryForm, tvOctalForm, tvHexaDecimalForm;
    Button btnConvertSz;

    TableLayout tbllResultTable;

    int spinPosition;

    String [] binaryTo = {"Decimal", "Binary", "Octal", "Hexadecimal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);

        spinPosition = 0;

        etNumberValue = findViewById(R.id.etNumberValue);
        tvDecimal = findViewById(R.id.tvDecimal);
        tvBinary = findViewById(R.id.tvBinary);
        tvOctal = findViewById(R.id.tvOctal);
        tvHexa = findViewById(R.id.tvHexa);
    /*
        tvDecimalForm = findViewById(R.id.tvDecimalForm);
        tvBinaryForm = findViewById(R.id.tvBinaryForm);
        tvOctalForm = findViewById(R.id.tvOctalForm);
        tvHexaDecimalForm = findViewById(R.id.tvHexaDecimalForm);
    */
        tbllResultTable = findViewById(R.id.tbllResultTable);

        btnConvertSz = findViewById(R.id.btnConvertSz);

        spConvertFromType = findViewById(R.id.spConvertFromType);



        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(Binary.this, android.R.layout.simple_spinner_item, binaryTo);

        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        //now set the adapter to the spinners
        spConvertFromType.setAdapter(spinnerAdapter);



        tvDecimal.setVisibility(View.GONE);
        tvBinary.setVisibility(View.GONE);
        tvHexa.setVisibility(View.GONE);
        tvOctal.setVisibility(View.GONE);

        tbllResultTable.setVisibility(View.GONE);

        spConvertFromType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                spinPosition = position;

                etNumberValue.setText("");
                tvDecimal.setText("");
                tvBinary.setText("");
                tvOctal.setText("");
                tvHexa.setText("");

                tbllResultTable.setVisibility(View.GONE);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btnConvertSz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculationCombination();
            }
        });

    }

    private void calculationCombination(){

        calculateDecimalForm();
        calculateBinaryForm();
        calculateOctalForm();
        calculateHexaForm();

    }

    private void calculateDecimalForm() {

        String value = etNumberValue.getText().toString().trim();

        if (!checkingInputValidation()) {
            switch (spinPosition) {
                case 0:
                    try {
                        tvDecimal.setText(value);
                        tvDecimal.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
                case 1:
                    try {
                        tvDecimal.setText("" + Long.parseLong(value, 2));
                        tvDecimal.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
                case 2:
                    try {
                        tvDecimal.setText("" + Long.parseLong(value, 8));
                        tvDecimal.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
                case 3:
                    try {
                        tvDecimal.setText("" +  Long.parseLong(value, 16));
                        tvDecimal.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
            }
        }

        tvDecimal.setVisibility(View.VISIBLE);
        tvBinary.setVisibility(View.VISIBLE);
        tvHexa.setVisibility(View.VISIBLE);
        tvOctal.setVisibility(View.VISIBLE);

        tbllResultTable.setVisibility(View.VISIBLE);

    }

    private void calculateBinaryForm() {

        String value = etNumberValue.getText().toString().trim();

        if (!checkingInputValidation()) {
            switch (spinPosition) {
                case 0:
                    try {
                        tvBinary.setText("" + Long.toBinaryString(Long.valueOf(value)));
                        tvBinary.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
                case 1:
                    try {
                        tvBinary.setText(value);
                        tvBinary.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
                case 2:
                    try {
                        tvBinary.setText("" + Long.toBinaryString(Long.parseLong(value, 8)));
                        tvBinary.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
                case 3:
                    try {
                        tvBinary.setText("" + Long.toBinaryString(Long.parseLong(value, 16)));
                        tvBinary.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
            }
        }

        tvDecimal.setVisibility(View.VISIBLE);
        tvBinary.setVisibility(View.VISIBLE);
        tvHexa.setVisibility(View.VISIBLE);
        tvOctal.setVisibility(View.VISIBLE);

        tbllResultTable.setVisibility(View.VISIBLE);

    }

    private void calculateOctalForm() {
        String value = etNumberValue.getText().toString();

        if (!checkingInputValidation()) {
            switch (spinPosition) {
                case 0:
                    try {
                        tvOctal.setText("" + Long.toOctalString(Long.valueOf(value)));
                        tvOctal.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }

                    break;
                case 1:
                    try {
                        long l = Long.parseLong(value, 2);
                        tvOctal.setText("" + Long.toOctalString(l));
                        tvOctal.setTextSize(20);

                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
                case 2:
                    try {
                        tvOctal.setText(value);
                        tvOctal.setTextSize(20);

                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
                case 3:
                    try {
                        tvOctal.setText("" + Long.toOctalString(Long.parseLong(value, 16)));
                        tvOctal.setTextSize(20);

                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
            }
        }

        tvDecimal.setVisibility(View.VISIBLE);
        tvBinary.setVisibility(View.VISIBLE);
        tvHexa.setVisibility(View.VISIBLE);
        tvOctal.setVisibility(View.VISIBLE);

        tbllResultTable.setVisibility(View.VISIBLE);

    }

    private void calculateHexaForm() {
        String value = etNumberValue.getText().toString();

        if (!checkingInputValidation()) {
            switch (spinPosition) {
                case 0:
                    try {
                        tvHexa.setText("" + Long.toHexString(Long.valueOf(value)));
                        tvHexa.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }

                    break;
                case 1:
                    try {
                        tvHexa.setText("" + Long.toHexString(Long.parseLong(value, 2)));
                        tvHexa.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }

                    break;
                case 2:
                    try {
                        tvHexa.setText("" + Long.toHexString(Long.parseLong(value, 8)));
                        tvHexa.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
                case 3:
                    try {
                        tvHexa.setText(value);
                        tvHexa.setTextSize(20);
                    } catch (Exception e) {
                        etNumberValue.setError("Please enter Correct Input");
                        requestFocus(etNumberValue);
                    }
                    break;
            }
        }

        tvDecimal.setVisibility(View.VISIBLE);
        tvBinary.setVisibility(View.VISIBLE);
        tvHexa.setVisibility(View.VISIBLE);
        tvOctal.setVisibility(View.VISIBLE);

        tbllResultTable.setVisibility(View.VISIBLE);
    }

    private boolean checkingInputValidation() {
        String gettingInput = etNumberValue.getText().toString();
        if (etNumberValue.getText().toString().trim().isEmpty()) {
            etNumberValue.setError("Please Enter the Number");
            requestFocus(etNumberValue);
            return true;
        } else if (gettingInput.matches(".*[G-Z].*") || gettingInput.matches(".*[g-z].*")) {
            etNumberValue.setError("Insert Capital Letter for A to F");
            requestFocus(etNumberValue);
            return true;
        }else if (spinPosition == 2 && gettingInput.matches(".*[8-9].*")) {
            etNumberValue.setError("Value must be 0 to 7");
            requestFocus(etNumberValue);
            return true;
        }else if (spinPosition == 1 && gettingInput.matches(".*[2-9].*")) {
            etNumberValue.setError("Value must be 0 or 1");
            requestFocus(etNumberValue);
            return true;
        }else if (gettingInput.length() > 15) {
            etNumberValue.setError("Insertion limited to 6 digit");
            requestFocus(etNumberValue);
            return true;
        }
        return false;
    }

    private void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

    private class MyTextWatcher implements TextWatcher {

        private View view;

        private MyTextWatcher(View view) {
            this.view = view;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }


        @Override
        public void afterTextChanged(Editable editable) {
            switch (view.getId()) {
                case R.id.etNumber:
                    validateInput();
                    break;

            }
        }
    }

    private void validateInput() {
        if (spinPosition == 0) {
            etNumberValue.setInputType(TYPE_CLASS_NUMBER);
        } else if (spinPosition == 1) {
            etNumberValue.setInputType(TYPE_CLASS_NUMBER);
        } else if (spinPosition == 2) {
            etNumberValue.setInputType(TYPE_CLASS_NUMBER);
        } else {
            etNumberValue.setInputType(TYPE_TEXT_FLAG_CAP_CHARACTERS);
        }
    }

}
