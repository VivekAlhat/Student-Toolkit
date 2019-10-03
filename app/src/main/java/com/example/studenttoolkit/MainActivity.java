package com.example.studenttoolkit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Cardview objects creation
    private CardView convCard,calcCard,notesCard,helpCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Defining individual cards
        convCard = (CardView) findViewById(R.id.converter);
        calcCard = (CardView) findViewById(R.id.calculator);
        notesCard = (CardView) findViewById(R.id.notes);
        helpCard = (CardView) findViewById(R.id.help);

        // On click listener
        convCard.setOnClickListener(this);
        calcCard.setOnClickListener(this);
        notesCard.setOnClickListener(this);
        helpCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.converter : i = new Intent(this,converter.class); startActivity(i); break;
            case R.id.calculator : i = new Intent(this,calculator.class); startActivity(i); break;
            case R.id.notes : i = new Intent(this,notes.class); startActivity(i); break;
            case R.id.help : i = new Intent(this,help.class); startActivity(i); break;
            default: break;
        }
    }
}
