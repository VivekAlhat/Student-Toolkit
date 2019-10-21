package com.example.studenttoolkit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ConverterActivity extends AppCompatActivity {

    ImageView ivTemperature, ivCGPA, ivUnit, ivBinary;
    CardView cvTemperature, cvCGPA, cvUnit, cvBinary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        cvTemperature = findViewById(R.id.cvTemprature);
        cvCGPA = findViewById(R.id.cvCGPA);
        cvUnit = findViewById(R.id.cvUnit);
        cvBinary = findViewById(R.id.cvBinary);

        ivTemperature = findViewById(R.id.ivTemperature);
        ivCGPA = findViewById(R.id.ivCGPA);
        ivUnit = findViewById(R.id.ivUnit);
        ivBinary = findViewById(R.id.ivBinary);

        //for cardView
        cvTemperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConverterActivity.this, com.example.studenttoolkit.Temperature.class);
                startActivity(intent);

            }
        });

        cvCGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ConverterActivity.this, com.example.studenttoolkit.CGPA.class);
                startActivity(intent);
            }
        });

        cvUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ConverterActivity.this, com.example.studenttoolkit.Unit.class);
                startActivity(intent);
            }
        });

        cvBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ConverterActivity.this, com.example.studenttoolkit.Binary.class);
                startActivity(intent);
            }
        });

        //for imageView
        ivTemperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConverterActivity.this, com.example.studenttoolkit.Temperature.class);
                startActivity(intent);

            }
        });

        ivCGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ConverterActivity.this, com.example.studenttoolkit.CGPA.class);
                startActivity(intent);
            }
        });

        ivUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ConverterActivity.this, com.example.studenttoolkit.Unit.class);
                startActivity(intent);
            }
        });

        ivBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ConverterActivity.this, com.example.studenttoolkit.Binary.class);
                startActivity(intent);
            }
        });
    }
}
