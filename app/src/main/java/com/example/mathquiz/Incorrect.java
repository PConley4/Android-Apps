package com.example.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Incorrect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrect);

        Intent messenger3 = getIntent();
        TextView progressText = null;
        int score = messenger3.getIntExtra("updatedscore", 0);
        progressText = findViewById(R.id.curscore2);
        progressText.setText(String.valueOf("Your current score is " + score + " ."));
    }


}