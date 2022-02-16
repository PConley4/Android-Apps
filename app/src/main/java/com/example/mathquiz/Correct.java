package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Correct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);
        TextView progressText = null;
        Intent messenger2 = getIntent();
        int score = messenger2.getIntExtra("updatedscore", 0);
        progressText = findViewById(R.id.curscore);
        progressText.setText(String.valueOf("Your current score is " + score + " ."));
    }

}