package com.example.studenttoolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class help extends AppCompatActivity implements ListFrag.ItemSelected {

    ArrayList<String> info;
    TextView tvInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        tvInfo =findViewById( R.id.tvInfo);

        info = new ArrayList<String>();
        info.add("In today's time it is difficult for a student to find all the educational resources in one app. The student has to download multiple apps to satisfy the educational needs.\n" +
                "\n" +
                "We as developers then identified this problem and created the Student Toolkit app which has all the basic requirements like converter, calculator and note keeper which is the basic requirement of every student. We hope that our efforts to make this app will make your work easier. ");
        info.add("Amit Badave\nShivani Oswal\nSiddharth Atre\nVivek Alhat ");
        info.add("We will be glad to help you with your queries.\n"+"\n"+" Contact us at:\n studenttoolkit@gmail.com ");



    }

    @Override
    public void onItemSelected(int index) {

        tvInfo.setText(info.get(index));
    }
}
