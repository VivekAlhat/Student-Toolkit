package com.example.studenttoolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class CGPA extends AppCompatActivity {

    EditText etCGPA;
    TextView tvPercentage;
    TextView tvPerc;
    Button btnConvertToPer;
    Double percentage;
    DecimalFormat tempCF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);

        etCGPA = findViewById(R.id.etCGPA);
        tvPercentage = findViewById(R.id.tvPercentage);
        btnConvertToPer = findViewById(R.id.btnConvertToPer);
        tvPerc = findViewById(R.id.tvPerc);

        tempCF = new DecimalFormat("#0.00");

        tvPercentage.setVisibility(View.GONE);
        tvPerc.setVisibility(View.GONE);

        btnConvertToPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            try {
                if (etCGPA.getText().toString().isEmpty()) {

                    Toast.makeText(CGPA.this, "Please enter CGPA", Toast.LENGTH_SHORT).show();
                    tvPercentage.setVisibility(View.GONE);
                    tvPerc.setVisibility(View.GONE);

                } else {

                    //double enteredCGPA " = Double.parseDouble(etCGPA.getText().toString());

                    String enteredCGPA = etCGPA.getText().toString();
                    switch (enteredCGPA) {

                        case "4.65":
                            percentage = 45.01;
                            break;
                        case "4.66":
                            percentage = 45.08;
                            break;
                        case "4.67":
                            percentage = 45.15;
                            break;
                        case "4.68":
                            percentage = 45.22;
                            break;
                        case "4.69":
                            percentage = 45.29;
                            break;
                        case "4.70":
                            percentage = 45.37;
                            break;
                        case "4.71":
                            percentage = 45.44;
                            break;
                        case "4.72":
                            percentage = 45.51;
                            break;
                        case "4.73":
                            percentage = 45.58;
                            break;
                        case "4.74":
                            percentage = 45.65;
                            break;
                        case "4.75":
                            percentage = 45.72;
                            break;
                        case "4.76":
                            percentage = 45.79;
                            break;
                        case "4.77":
                            percentage = 45.86;
                            break;
                        case "4.78":
                            percentage = 45.93;
                            break;
                        case "4.79":
                            percentage = 46.00;
                            break;
                        case "4.80":
                            percentage = 46.08;
                            break;
                        case "4.81":
                            percentage = 46.15;
                            break;
                        case "4.82":
                            percentage = 46.22;
                            break;
                        case "4.83":
                            percentage = 46.29;
                            break;
                        case "4.84":
                            percentage = 46.36;
                            break;
                        case "4.85":
                            percentage = 46.43;
                            break;
                        case "4.86":
                            percentage = 46.50;
                            break;
                        case "4.87":
                            percentage = 46.57;
                            break;
                        case "4.88":
                            percentage = 46.64;
                            break;
                        case "4.89":
                            percentage = 46.71;
                            break;
                        case "4.90":
                            percentage = 46.79;
                            break;
                        case "4.91":
                            percentage = 46.86;
                            break;
                        case "4.92":
                            percentage = 46.93;
                            break;
                        case "4.93":
                            percentage = 47.00;
                            break;
                        case "4.94":
                            percentage = 47.07;
                            break;
                        case "4.95":
                            percentage = 47.14;
                            break;
                        case "4.96":
                            percentage = 47.21;
                            break;
                        case "4.97":
                            percentage = 47.28;
                            break;
                        case "4.98":
                            percentage = 47.35;
                            break;
                        case "4.99":
                            percentage = 47.42;
                            break;
                        case "5.00":
                            percentage = 47.50;
                            break;
                        case "5.01":
                            percentage = 47.57;
                            break;
                        case "5.02":
                            percentage = 47.64;
                            break;
                        case "5.03":
                            percentage = 47.71;
                            break;
                        case "5.04":
                            percentage = 47.78;
                            break;
                        case "5.05":
                            percentage = 47.85;
                            break;
                        case "5.06":
                            percentage = 47.92;
                            break;
                        case "5.07":
                            percentage = 47.99;
                            break;
                        case "5.08":
                            percentage = 48.06;
                            break;
                        case "5.09":
                            percentage = 48.13;
                            break;
                        case "5.10":
                            percentage = 48.21;
                            break;
                        case "5.11":
                            percentage = 48.28;
                            break;
                        case "5.12":
                            percentage = 48.35;
                            break;
                        case "5.13":
                            percentage = 48.42;
                            break;
                        case "5.14":
                            percentage = 48.49;
                            break;
                        case "5.15":
                            percentage = 48.56;
                            break;
                        case "5.16":
                            percentage = 48.63;
                            break;
                        case "5.17":
                            percentage = 48.70;
                            break;
                        case "5.18":
                            percentage = 48.77;
                            break;
                        case "5.19":
                            percentage = 48.84;
                            break;
                        case "5.20":
                            percentage = 48.92;
                            break;
                        case "5.21":
                            percentage = 48.99;
                            break;
                        case "5.22":
                            percentage = 49.06;
                            break;
                        case "5.23":
                            percentage = 49.13;
                            break;
                        case "5.24":
                            percentage = 49.20;
                            break;
                        case "5.25":
                            percentage = 49.27;
                            break;
                        case "5.26":
                            percentage = 49.34;
                            break;
                        case "5.27":
                            percentage = 49.41;
                            break;
                        case "5.28":
                            percentage = 49.48;
                            break;
                        case "5.29":
                            percentage = 49.55;
                            break;
                        case "5.30":
                            percentage = 49.63;
                            break;
                        case "5.31":
                            percentage = 49.70;
                            break;
                        case "5.32":
                            percentage = 49.77;
                            break;
                        case "5.33":
                            percentage = 49.84;
                            break;
                        case "5.34":
                            percentage = 49.91;
                            break;
                        case "5.35":
                            percentage = 49.98;
                            break;
                        case "5.36":
                            percentage = 50.05;
                            break;
                        case "5.37":
                            percentage = 50.12;
                            break;
                        case "5.38":
                            percentage = 50.19;
                            break;
                        case "5.39":
                            percentage = 50.26;
                            break;
                        case "5.40":
                            percentage = 50.34;
                            break;
                        case "5.41":
                            percentage = 50.41;
                            break;
                        case "5.42":
                            percentage = 50.48;
                            break;
                        case "5.43":
                            percentage = 50.55;
                            break;
                        case "5.44":
                            percentage = 50.62;
                            break;
                        case "5.45":
                            percentage = 50.69;
                            break;
                        case "5.46":
                            percentage = 50.76;
                            break;
                        case "5.47":
                            percentage = 50.83;
                            break;
                        case "5.48":
                            percentage = 50.90;
                            break;
                        case "5.49":
                            percentage = 50.97;
                            break;
                        case "5.50":
                            percentage = 51.05;
                            break;
                        case "5.51":
                            percentage = 51.12;
                            break;
                        case "5.52":
                            percentage = 51.19;
                            break;
                        case "5.53":
                            percentage = 51.26;
                            break;
                        case "5.54":
                            percentage = 51.33;
                            break;
                        case "5.55":
                            percentage = 51.40;
                            break;
                        case "5.56":
                            percentage = 51.47;
                            break;
                        case "5.57":
                            percentage = 51.54;
                            break;
                        case "5.58":
                            percentage = 51.61;
                            break;
                        case "5.59":
                            percentage = 51.68;
                            break;
                        case "5.60":
                            percentage = 51.76;
                            break;
                        case "5.61":
                            percentage = 51.83;
                            break;
                        case "5.62":
                            percentage = 51.90;
                            break;
                        case "5.63":
                            percentage = 51.97;
                            break;
                        case "5.64":
                            percentage = 52.04;
                            break;
                        case "5.65":
                            percentage = 52.11;
                            break;
                        case "5.66":
                            percentage = 52.18;
                            break;
                        case "5.67":
                            percentage = 52.25;
                            break;
                        case "5.68":
                            percentage = 52.32;
                            break;
                        case "5.69":
                            percentage = 52.39;
                            break;
                        case "5.70":
                            percentage = 52.47;
                            break;
                        case "5.71":
                            percentage = 52.54;
                            break;
                        case "5.72":
                            percentage = 52.61;
                            break;
                        case "5.73":
                            percentage = 52.68;
                            break;
                        case "5.74":
                            percentage = 52.75;
                            break;
                        case "5.75":
                            percentage = 52.82;
                            break;
                        case "5.76":
                            percentage = 52.89;
                            break;
                        case "5.77":
                            percentage = 52.96;
                            break;
                        case "5.78":
                            percentage = 53.03;
                            break;
                        case "5.79":
                            percentage = 53.10;
                            break;
                        case "5.80":
                            percentage = 53.18;
                            break;
                        case "5.81":
                            percentage = 53.25;
                            break;
                        case "5.82":
                            percentage = 53.32;
                            break;
                        case "5.83":
                            percentage = 53.39;
                            break;
                        case "5.84":
                            percentage = 53.46;
                            break;
                        case "5.85":
                            percentage = 53.53;
                            break;
                        case "5.86":
                            percentage = 53.60;
                            break;
                        case "5.87":
                            percentage = 53.67;
                            break;
                        case "5.88":
                            percentage = 53.74;
                            break;
                        case "5.89":
                            percentage = 53.81;
                            break;
                        case "5.90":
                            percentage = 53.89;
                            break;
                        case "5.91":
                            percentage = 53.96;
                            break;
                        case "5.92":
                            percentage = 54.03;
                            break;
                        case "5.93":
                            percentage = 54.10;
                            break;
                        case "5.94":
                            percentage = 54.17;
                            break;
                        case "5.95":
                            percentage = 54.24;
                            break;
                        case "5.96":
                            percentage = 54.31;
                            break;
                        case "5.97":
                            percentage = 54.38;
                            break;
                        case "5.98":
                            percentage = 54.45;
                            break;
                        case "5.99":
                            percentage = 54.52;
                            break;
                        case "6.00":
                            percentage = 54.60;
                            break;
                        case "6.01":
                            percentage = 54.67;
                            break;
                        case "6.02":
                            percentage = 54.74;
                            break;
                        case "6.03":
                            percentage = 54.81;
                            break;
                        case "6.04":
                            percentage = 54.88;
                            break;
                        case "6.05":
                            percentage = 54.95;
                            break;
                        case "6.06":
                            percentage = 55.02;
                            break;
                        case "6.07":
                            percentage = 55.09;
                            break;
                        case "6.08":
                            percentage = 55.16;
                            break;
                        case "6.09":
                            percentage = 55.23;
                            break;
                        case "6.10":
                            percentage = 55.31;
                            break;
                        case "6.11":
                            percentage = 55.38;
                            break;
                        case "6.12":
                            percentage = 55.45;
                            break;
                        case "6.13":
                            percentage = 55.52;
                            break;
                        case "6.14":
                            percentage = 55.59;
                            break;
                        case "6.15":
                            percentage = 55.66;
                            break;
                        case "6.16":
                            percentage = 55.73;
                            break;
                        case "6.17":
                            percentage = 55.80;
                            break;
                        case "6.18":
                            percentage = 55.87;
                            break;
                        case "6.19":
                            percentage = 55.94;
                            break;
                        case "6.20":
                            percentage = 56.02;
                            break;
                        case "6.21":
                            percentage = 56.09;
                            break;
                        case "6.22":
                            percentage = 56.16;
                            break;
                        case "6.23":
                            percentage = 56.23;
                            break;
                        case "6.24":
                            percentage = 56.30;
                            break;
                        case "6.25":
                            percentage = 56.37;
                            break;
                        case "6.26":
                            percentage = 56.44;
                            break;
                        case "6.27":
                            percentage = 56.51;
                            break;
                        case "6.28":
                            percentage = 56.58;
                            break;
                        case "6.29":
                            percentage = 56.65;
                            break;
                        case "6.30":
                            percentage = 56.73;
                            break;
                        case "6.31":
                            percentage = 56.80;
                            break;
                        case "6.32":
                            percentage = 56.87;
                            break;
                        case "6.33":
                            percentage = 56.94;
                            break;
                        case "6.34":
                            percentage = 57.01;
                            break;
                        case "6.35":
                            percentage = 57.08;
                            break;
                        case "6.36":
                            percentage = 57.15;
                            break;
                        case "6.37":
                            percentage = 57.22;
                            break;
                        case "6.38":
                            percentage = 57.29;
                            break;
                        case "6.39":
                            percentage = 57.36;
                            break;
                        case "6.40":
                            percentage = 57.44;
                            break;
                        case "6.41":
                            percentage = 57.51;
                            break;
                        case "6.42":
                            percentage = 57.58;
                            break;
                        case "6.43":
                            percentage = 57.65;
                            break;
                        case "6.44":
                            percentage = 57.72;
                            break;
                        case "6.45":
                            percentage = 57.79;
                            break;
                        case "6.46":
                            percentage = 57.86;
                            break;
                        case "6.47":
                            percentage = 57.93;
                            break;
                        case "6.48":
                            percentage = 58.00;
                            break;
                        case "6.49":
                            percentage = 58.07;
                            break;
                        case "6.50":
                            percentage = 58.15;
                            break;
                        case "6.51":
                            percentage = 58.22;
                            break;
                        case "6.52":
                            percentage = 58.29;
                            break;
                        case "6.53":
                            percentage = 58.36;
                            break;
                        case "6.54":
                            percentage = 58.43;
                            break;
                        case "6.55":
                            percentage = 58.50;
                            break;
                        case "6.56":
                            percentage = 58.57;
                            break;
                        case "6.57":
                            percentage = 58.64;
                            break;
                        case "6.58":
                            percentage = 58.71;
                            break;
                        case "6.59":
                            percentage = 58.78;
                            break;
                        case "6.60":
                            percentage = 58.86;
                            break;
                        case "6.61":
                            percentage = 58.93;
                            break;
                        case "6.62":
                            percentage = 59.00;
                            break;
                        case "6.63":
                            percentage = 59.07;
                            break;
                        case "6.64":
                            percentage = 59.14;
                            break;
                        case "6.65":
                            percentage = 59.21;
                            break;
                        case "6.66":
                            percentage = 59.28;
                            break;
                        case "6.67":
                            percentage = 59.35;
                            break;
                        case "6.68":
                            percentage = 59.42;
                            break;
                        case "6.69":
                            percentage = 59.49;
                            break;
                        case "6.70":
                            percentage = 59.57;
                            break;
                        case "6.71":
                            percentage = 59.64;
                            break;
                        case "6.72":
                            percentage = 59.71;
                            break;
                        case "6.73":
                            percentage = 59.78;
                            break;
                        case "6.74":
                            percentage = 59.85;
                            break;
                        case "6.75":
                            percentage = 59.92;
                            break;
                        case "6.76":
                            percentage = 59.99;
                            break;
                        case "6.77":
                            percentage = 60.06;
                            break;
                        case "6.78":
                            percentage = 60.13;
                            break;
                        case "6.79":
                            percentage = 60.20;
                            break;
                        case "6.80":
                            percentage = 60.28;
                            break;
                        case "6.81":
                            percentage = 60.35;
                            break;
                        case "6.82":
                            percentage = 60.42;
                            break;
                        case "6.83":
                            percentage = 60.49;
                            break;
                        case "6.84":
                            percentage = 60.56;
                            break;
                        case "6.85":
                            percentage = 60.63;
                            break;
                        case "6.86":
                            percentage = 60.70;
                            break;
                        case "6.87":
                            percentage = 60.77;
                            break;
                        case "6.88":
                            percentage = 60.84;
                            break;
                        case "6.89":
                            percentage = 60.91;
                            break;
                        case "6.90":
                            percentage = 60.99;
                            break;
                        case "6.91":
                            percentage = 61.06;
                            break;
                        case "6.92":
                            percentage = 61.13;
                            break;
                        case "6.93":
                            percentage = 61.20;
                            break;
                        case "6.94":
                            percentage = 61.27;
                            break;
                        case "6.95":
                            percentage = 61.34;
                            break;
                        case "6.96":
                            percentage = 61.41;
                            break;
                        case "6.97":
                            percentage = 61.48;
                            break;
                        case "6.98":
                            percentage = 61.55;
                            break;
                        case "6.99":
                            percentage = 61.62;
                            break;
                        case "7.00":
                            percentage = 63.80;
                            break;
                        case "7.01":
                            percentage = 63.87;
                            break;
                        case "7.02":
                            percentage = 63.94;
                            break;
                        case "7.03":
                            percentage = 64.02;
                            break;
                        case "7.04":
                            percentage = 64.09;
                            break;
                        case "7.05":
                            percentage = 64.17;
                            break;
                        case "7.06":
                            percentage = 64.24;
                            break;
                        case "7.07":
                            percentage = 64.31;
                            break;
                        case "7.08":
                            percentage = 64.39;
                            break;
                        case "7.09":
                            percentage = 64.46;
                            break;
                        case "7.10":
                            percentage = 64.54;
                            break;
                        case "7.11":
                            percentage = 64.61;
                            break;
                        case "7.12":
                            percentage = 64.68;
                            break;
                        case "7.13":
                            percentage = 64.76;
                            break;
                        case "7.14":
                            percentage = 64.83;
                            break;
                        case "7.15":
                            percentage = 64.91;
                            break;
                        case "7.16":
                            percentage = 64.98;
                            break;
                        case "7.17":
                            percentage = 65.05;
                            break;
                        case "7.18":
                            percentage = 65.13;
                            break;
                        case "7.19":
                            percentage = 65.20;
                            break;
                        case "7.20":
                            percentage = 65.28;
                            break;
                        case "7.21":
                            percentage = 65.35;
                            break;
                        case "7.22":
                            percentage = 65.42;
                            break;
                        case "7.23":
                            percentage = 65.50;
                            break;
                        case "7.24":
                            percentage = 65.57;
                            break;
                        case "7.25":
                            percentage = 65.65;
                            break;
                        case "7.26":
                            percentage = 65.72;
                            break;
                        case "7.27":
                            percentage = 65.79;
                            break;
                        case "7.28":
                            percentage = 65.87;
                            break;
                        case "7.29":
                            percentage = 65.94;
                            break;
                        case "7.30":
                            percentage = 66.02;
                            break;
                        case "7.31":
                            percentage = 66.09;
                            break;
                        case "7.32":
                            percentage = 66.16;
                            break;
                        case "7.33":
                            percentage = 66.24;
                            break;
                        case "7.34":
                            percentage = 66.31;
                            break;
                        case "7.35":
                            percentage = 66.39;
                            break;
                        case "7.36":
                            percentage = 66.46;
                            break;
                        case "7.37":
                            percentage = 66.53;
                            break;
                        case "7.38":
                            percentage = 66.61;
                            break;
                        case "7.39":
                            percentage = 66.68;
                            break;
                        case "7.40":
                            percentage = 66.76;
                            break;
                        case "7.41":
                            percentage = 66.83;
                            break;
                        case "7.42":
                            percentage = 66.90;
                            break;
                        case "7.43":
                            percentage = 66.98;
                            break;
                        case "7.44":
                            percentage = 67.05;
                            break;
                        case "7.45":
                            percentage = 67.13;
                            break;
                        case "7.46":
                            percentage = 67.20;
                            break;
                        case "7.47":
                            percentage = 67.27;
                            break;
                        case "7.48":
                            percentage = 67.35;
                            break;
                        case "7.49":
                            percentage = 67.42;
                            break;
                        case "7.50":
                            percentage = 67.50;
                            break;
                        case "7.51":
                            percentage = 67.57;
                            break;
                        case "7.52":
                            percentage = 67.64;
                            break;
                        case "7.53":
                            percentage = 67.72;
                            break;
                        case "7.54":
                            percentage = 67.79;
                            break;
                        case "7.55":
                            percentage = 67.87;
                            break;
                        case "7.56":
                            percentage = 67.94;
                            break;
                        case "7.57":
                            percentage = 68.01;
                            break;
                        case "7.58":
                            percentage = 68.09;
                            break;
                        case "7.59":
                            percentage = 68.16;
                            break;
                        case "7.60":
                            percentage = 68.24;
                            break;
                        case "7.61":
                            percentage = 68.31;
                            break;
                        case "7.62":
                            percentage = 68.38;
                            break;
                        case "7.63":
                            percentage = 68.46;
                            break;
                        case "7.64":
                            percentage = 68.53;
                            break;
                        case "7.65":
                            percentage = 68.61;
                            break;
                        case "7.66":
                            percentage = 68.68;
                            break;
                        case "7.67":
                            percentage = 68.75;
                            break;
                        case "7.68":
                            percentage = 68.83;
                            break;
                        case "7.69":
                            percentage = 68.90;
                            break;
                        case "7.70":
                            percentage = 68.98;
                            break;
                        case "7.71":
                            percentage = 69.05;
                            break;
                        case "7.72":
                            percentage = 69.12;
                            break;
                        case "7.73":
                            percentage = 69.20;
                            break;
                        case "7.74":
                            percentage = 69.27;
                            break;
                        case "7.75":
                            percentage = 69.35;
                            break;
                        case "7.76":
                            percentage = 69.42;
                            break;
                        case "7.77":
                            percentage = 69.49;
                            break;
                        case "7.78":
                            percentage = 69.57;
                            break;
                        case "7.79":
                            percentage = 69.64;
                            break;
                        case "7.80":
                            percentage = 69.72;
                            break;
                        case "7.81":
                            percentage = 69.79;
                            break;
                        case "7.82":
                            percentage = 69.86;
                            break;
                        case "7.83":
                            percentage = 69.94;
                            break;
                        case "7.84":
                            percentage = 70.01;
                            break;
                        case "7.85":
                            percentage = 70.09;
                            break;
                        case "7.86":
                            percentage = 70.16;
                            break;
                        case "7.87":
                            percentage = 70.23;
                            break;
                        case "7.88":
                            percentage = 70.31;
                            break;
                        case "7.89":
                            percentage = 70.38;
                            break;
                        case "7.90":
                            percentage = 70.46;
                            break;
                        case "7.91":
                            percentage = 70.53;
                            break;
                        case "7.92":
                            percentage = 70.60;
                            break;
                        case "7.93":
                            percentage = 70.68;
                            break;
                        case "7.94":
                            percentage = 70.75;
                            break;
                        case "7.95":
                            percentage = 70.83;
                            break;
                        case "7.96":
                            percentage = 70.90;
                            break;
                        case "7.97":
                            percentage = 70.97;
                            break;
                        case "7.98":
                            percentage = 71.05;
                            break;
                        case "7.99":
                            percentage = 71.12;
                            break;
                        case "8.00":
                            percentage = 71.20;
                            break;
                        case "8.01":
                            percentage = 71.27;
                            break;
                        case "8.02":
                            percentage = 71.34;
                            break;
                        case "8.03":
                            percentage = 71.42;
                            break;
                        case "8.04":
                            percentage = 71.49;
                            break;
                        case "8.05":
                            percentage = 71.57;
                            break;
                        case "8.06":
                            percentage = 71.64;
                            break;
                        case "8.07":
                            percentage = 71.71;
                            break;
                        case "8.08":
                            percentage = 71.79;
                            break;
                        case "8.09":
                            percentage = 71.86;
                            break;
                        case "8.10":
                            percentage = 71.94;
                            break;
                        case "8.11":
                            percentage = 72.01;
                            break;
                        case "8.12":
                            percentage = 72.08;
                            break;
                        case "8.13":
                            percentage = 72.16;
                            break;
                        case "8.14":
                            percentage = 72.23;
                            break;
                        case "8.15":
                            percentage = 72.31;
                            break;
                        case "8.16":
                            percentage = 72.38;
                            break;
                        case "8.17":
                            percentage = 72.45;
                            break;
                        case "8.18":
                            percentage = 72.53;
                            break;
                        case "8.19":
                            percentage = 72.60;
                            break;
                        case "8.20":
                            percentage = 72.68;
                            break;
                        case "8.21":
                            percentage = 72.75;
                            break;
                        case "8.22":
                            percentage = 72.82;
                            break;
                        case "8.23":
                            percentage = 72.90;
                            break;
                        case "8.24":
                            percentage = 72.97;
                            break;
                        case "8.25":
                            percentage = 73.05;
                            break;
                        case "8.26":
                            percentage = 73.12;
                            break;
                        case "8.27":
                            percentage = 73.19;
                            break;
                        case "8.28":
                            percentage = 73.27;
                            break;
                        case "8.29":
                            percentage = 73.34;
                            break;
                        case "8.30":
                            percentage = 73.42;
                            break;
                        case "8.31":
                            percentage = 73.49;
                            break;
                        case "8.32":
                            percentage = 73.56;
                            break;
                        case "8.33":
                            percentage = 73.64;
                            break;
                        case "8.34":
                            percentage = 73.71;
                            break;
                        case "8.35":
                            percentage = 73.79;
                            break;
                        case "8.36":
                            percentage = 73.86;
                            break;
                        case "8.37":
                            percentage = 73.93;
                            break;
                        case "8.38":
                            percentage = 74.01;
                            break;
                        case "8.39":
                            percentage = 74.08;
                            break;
                        case "8.40":
                            percentage = 74.16;
                            break;
                        case "8.41":
                            percentage = 74.23;
                            break;
                        case "8.42":
                            percentage = 74.30;
                            break;
                        case "8.43":
                            percentage = 74.38;
                            break;
                        case "8.44":
                            percentage = 74.45;
                            break;
                        case "8.45":
                            percentage = 74.53;
                            break;
                        case "8.46":
                            percentage = 74.60;
                            break;
                        case "8.47":
                            percentage = 74.67;
                            break;
                        case "8.48":
                            percentage = 74.75;
                            break;
                        case "8.49":
                            percentage = 74.82;
                            break;
                        case "8.50":
                            percentage = 74.90;
                            break;
                        case "8.51":
                            percentage = 74.97;
                            break;
                        case "8.52":
                            percentage = 75.04;
                            break;
                        case "8.53":
                            percentage = 75.12;
                            break;
                        case "8.54":
                            percentage = 75.19;
                            break;
                        case "8.55":
                            percentage = 75.27;
                            break;
                        case "8.56":
                            percentage = 75.34;
                            break;
                        case "8.57":
                            percentage = 75.41;
                            break;
                        case "8.58":
                            percentage = 75.49;
                            break;
                        case "8.59":
                            percentage = 75.56;
                            break;
                        case "8.60":
                            percentage = 75.64;
                            break;
                        case "8.61":
                            percentage = 75.71;
                            break;
                        case "8.62":
                            percentage = 75.78;
                            break;
                        case "8.63":
                            percentage = 75.86;
                            break;
                        case "8.64":
                            percentage = 75.93;
                            break;
                        case "8.65":
                            percentage = 76.01;
                            break;
                        case "8.66":
                            percentage = 76.08;
                            break;
                        case "8.67":
                            percentage = 76.15;
                            break;
                        case "8.68":
                            percentage = 76.23;
                            break;
                        case "8.69":
                            percentage = 76.30;
                            break;
                        case "8.70":
                            percentage = 76.38;
                            break;
                        case "8.71":
                            percentage = 76.45;
                            break;
                        case "8.72":
                            percentage = 76.52;
                            break;
                        case "8.73":
                            percentage = 76.60;
                            break;
                        case "8.74":
                            percentage = 76.67;
                            break;
                        case "8.75":
                            percentage = 76.75;
                            break;
                        case "8.76":
                            percentage = 76.82;
                            break;
                        case "8.77":
                            percentage = 76.89;
                            break;
                        case "8.78":
                            percentage = 76.97;
                            break;
                        case "8.79":
                            percentage = 77.04;
                            break;
                        case "8.80":
                            percentage = 77.12;
                            break;
                        case "8.81":
                            percentage = 77.19;
                            break;
                        case "8.82":
                            percentage = 77.26;
                            break;
                        case "8.83":
                            percentage = 77.34;
                            break;
                        case "8.84":
                            percentage = 77.41;
                            break;
                        case "8.85":
                            percentage = 77.49;
                            break;
                        case "8.86":
                            percentage = 77.56;
                            break;
                        case "8.87":
                            percentage = 77.63;
                            break;
                        case "8.88":
                            percentage = 77.71;
                            break;
                        case "8.89":
                            percentage = 77.78;
                            break;
                        case "8.90":
                            percentage = 77.86;
                            break;
                        case "8.91":
                            percentage = 77.93;
                            break;
                        case "8.92":
                            percentage = 78.00;
                            break;
                        case "8.93":
                            percentage = 78.08;
                            break;
                        case "8.94":
                            percentage = 78.15;
                            break;
                        case "8.95":
                            percentage = 78.23;
                            break;
                        case "8.96":
                            percentage = 78.30;
                            break;
                        case "8.97":
                            percentage = 78.37;
                            break;
                        case "8.98":
                            percentage = 78.45;
                            break;
                        case "8.99":
                            percentage = 78.52;
                            break;
                        case "9.00":
                            percentage = 78.60;
                            break;
                        case "9.01":
                            percentage = 78.67;
                            break;
                        case "9.02":
                            percentage = 78.74;
                            break;
                        case "9.03":
                            percentage = 78.82;
                            break;
                        case "9.04":
                            percentage = 78.89;
                            break;
                        case "9.05":
                            percentage = 78.97;
                            break;
                        case "9.06":
                            percentage = 79.04;
                            break;
                        case "9.07":
                            percentage = 79.11;
                            break;
                        case "9.08":
                            percentage = 79.19;
                            break;
                        case "9.09":
                            percentage = 79.26;
                            break;
                        case "9.10":
                            percentage = 79.34;
                            break;
                        case "9.11":
                            percentage = 79.41;
                            break;
                        case "9.12":
                            percentage = 79.48;
                            break;
                        case "9.13":
                            percentage = 79.56;
                            break;
                        case "9.14":
                            percentage = 79.63;
                            break;
                        case "9.15":
                            percentage = 79.71;
                            break;
                        case "9.16":
                            percentage = 79.78;
                            break;
                        case "9.17":
                            percentage = 79.85;
                            break;
                        case "9.18":
                            percentage = 79.93;
                            break;
                        case "9.19":
                            percentage = 80.00;
                            break;
                        case "9.20":
                            percentage = 80.08;
                            break;
                        case "9.21":
                            percentage = 80.15;
                            break;
                        case "9.22":
                            percentage = 80.22;
                            break;
                        case "9.23":
                            percentage = 80.30;
                            break;
                        case "9.24":
                            percentage = 80.37;
                            break;
                        case "9.25":
                            percentage = 80.45;
                            break;
                        case "9.26":
                            percentage = 80.52;
                            break;
                        case "9.27":
                            percentage = 80.59;
                            break;
                        case "9.28":
                            percentage = 80.67;
                            break;
                        case "9.29":
                            percentage = 80.74;
                            break;
                        case "9.30":
                            percentage = 80.82;
                            break;
                        case "9.31":
                            percentage = 80.89;
                            break;
                        case "9.32":
                            percentage = 80.96;
                            break;
                        case "9.33":
                            percentage = 81.04;
                            break;
                        case "9.34":
                            percentage = 81.11;
                            break;
                        case "9.35":
                            percentage = 81.19;
                            break;
                        case "9.36":
                            percentage = 81.26;
                            break;
                        case "9.37":
                            percentage = 81.33;
                            break;
                        case "9.38":
                            percentage = 81.41;
                            break;
                        case "9.39":
                            percentage = 81.48;
                            break;
                        case "9.40":
                            percentage = 81.56;
                            break;
                        case "9.41":
                            percentage = 81.63;
                            break;
                        case "9.42":
                            percentage = 81.70;
                            break;
                        case "9.43":
                            percentage = 81.78;
                            break;
                        case "9.44":
                            percentage = 81.85;
                            break;
                        case "9.45":
                            percentage = 81.93;
                            break;
                        case "9.46":
                            percentage = 82.00;
                            break;
                        case "9.47":
                            percentage = 82.07;
                            break;
                        case "9.48":
                            percentage = 82.15;
                            break;
                        case "9.49":
                            percentage = 82.22;
                            break;
                        case "9.50":
                            percentage = 82.30;
                            break;
                        case "9.51":
                            percentage = 82.37;
                            break;
                        case "9.52":
                            percentage = 82.44;
                            break;
                        case "9.53":
                            percentage = 82.52;
                            break;
                        case "9.54":
                            percentage = 82.59;
                            break;
                        case "9.55":
                            percentage = 82.67;
                            break;
                        case "9.56":
                            percentage = 82.74;
                            break;
                        case "9.57":
                            percentage = 82.81;
                            break;
                        case "9.58":
                            percentage = 82.89;
                            break;
                        case "9.59":
                            percentage = 82.96;
                            break;
                        case "9.60":
                            percentage = 83.04;
                            break;
                        case "9.61":
                            percentage = 83.11;
                            break;
                        case "9.62":
                            percentage = 83.18;
                            break;
                        case "9.63":
                            percentage = 83.26;
                            break;
                        case "9.64":
                            percentage = 83.33;
                            break;
                        case "9.65":
                            percentage = 83.41;
                            break;
                        case "9.66":
                            percentage = 83.48;
                            break;
                        case "9.67":
                            percentage = 83.55;
                            break;
                        case "9.68":
                            percentage = 83.63;
                            break;
                        case "9.69":
                            percentage = 83.70;
                            break;
                        case "9.70":
                            percentage = 83.78;
                            break;
                        case "9.71":
                            percentage = 83.85;
                            break;
                        case "9.72":
                            percentage = 83.92;
                            break;
                        case "9.73":
                            percentage = 84.00;
                            break;
                        case "9.74":
                            percentage = 84.07;
                            break;
                        case "9.75":
                            percentage = 84.15;
                            break;
                        case "9.76":
                            percentage = 84.22;
                            break;
                        case "9.77":
                            percentage = 84.29;
                            break;
                        case "9.78":
                            percentage = 84.37;
                            break;
                        case "9.79":
                            percentage = 84.44;
                            break;
                        case "9.80":
                            percentage = 84.52;
                            break;
                        case "9.81":
                            percentage = 84.59;
                            break;
                        case "9.82":
                            percentage = 84.66;
                            break;
                        case "9.83":
                            percentage = 84.74;
                            break;
                        case "9.84":
                            percentage = 84.81;
                            break;
                        case "9.85":
                            percentage = 84.89;
                            break;
                        case "9.86":
                            percentage = 84.96;
                            break;
                        case "9.87":
                            percentage = 85.03;
                            break;
                        case "9.88":
                            percentage = 85.11;
                            break;
                        case "9.89":
                            percentage = 85.18;
                            break;
                        case "9.90":
                            percentage = 85.26;
                            break;
                        case "9.91":
                            percentage = 85.33;
                            break;
                        case "9.92":
                            percentage = 85.40;
                            break;
                        case "9.93":
                            percentage = 85.48;
                            break;
                        case "9.94":
                            percentage = 85.55;
                            break;
                        case "9.95":
                            percentage = 85.63;
                            break;
                        case "9.96":
                            percentage = 85.70;
                            break;
                        case "9.97":
                            percentage = 85.77;
                            break;
                        case "9.98":
                            percentage = 85.85;
                            break;
                        case "9.99":
                            percentage = 85.92;
                            break;

                    }

                    //generatedPer = enteredCGPA * 9.5;

                    tvPercentage.setText("Result : " + tempCF.format(percentage) + " %");
                    tvPerc.setVisibility(View.VISIBLE);
                    tvPercentage.setVisibility(View.VISIBLE);

                }
            }
            catch (Exception excp){

                Toast.makeText(CGPA.this, "Please Enter CGPA in Given Format (e.g. 6.57)!", Toast.LENGTH_SHORT).show();
            }
            }
        });
        

    }
}
