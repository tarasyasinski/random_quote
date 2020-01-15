package com.example.quote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random Random = new Random();
    TextView textQuote;
    Button buttonQuote;

    String randQuote = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textQuote = findViewById(R.id.quoteTextView);
        buttonQuote = findViewById (R.id.nextQuoteButton);

        buttonQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayQuote();
            }
        });

        displayQuote();
    }

    public void displayQuote(){
        // Випадковий номер між 10 та 1
        int randNum = Random.nextInt((10+1)-1)+1;

        switch (randNum){
            case 1 :
                randQuote = getString(R.string.quote1);
                break;
            case 2 :
                randQuote = getString(R.string.quote2);
                break;
            case 3 :
                randQuote = getString(R.string.quote3);
                break;
            case 4 :
                randQuote = getString(R.string.quote4);
                break;
            case 5 :
                randQuote = getString(R.string.quote5);
                break;
            case 6 :
                randQuote = getString(R.string.quote6);
                break;
            case 7 :
                randQuote = getString(R.string.quote7);
                break;
            case 8 :
                randQuote = getString(R.string.quote8);
                break;
            case 9 :
                randQuote = getString(R.string.quote9);
                break;
            case 10 :
                randQuote = getString(R.string.quote10);
                break;
        }

        textQuote.setText(randQuote);

    }

    public void shareQuote(View view){
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, randQuote );
        startActivity(Intent.createChooser(shareIntent, "Select an App"));
    }
}
