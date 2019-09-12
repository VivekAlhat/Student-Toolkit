package com.example.studenttoolkit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.studenttoolkit.R.layout.activity_main;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Cardview objects creation
    private CardView notesCard,calcCard,errorCard,helpCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Defining individual cards
        notesCard = (CardView) findViewById(R.id.notes);
        calcCard = (CardView) findViewById(R.id.calculator);
        errorCard = (CardView) findViewById(R.id.err404);
        helpCard = (CardView) findViewById(R.id.help);

        // On click listener
        notesCard.setOnClickListener(this);
        calcCard.setOnClickListener(this);
        errorCard.setOnClickListener(this);
        helpCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.notes : i = new Intent();
        }
    }
}
