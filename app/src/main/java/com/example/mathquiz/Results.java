package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent messenger4 = getIntent();
        TextView finalText = null;
        TextView resultsText = null;

        int score = messenger4.getIntExtra("updatedscore",0);
        finalText = findViewById(R.id.finalscore);
        finalText.setText(String.valueOf("Your final score is " + score + " ."));


        resultsText = findViewById(R.id.results);
        if (score >= 4) {
            resultsText.setText(String.valueOf("Congrats! You're a star!"));
        }
        else{
            resultsText.setText(String.valueOf("That's too bad. You'll do better next time!"));
        }
    }
}