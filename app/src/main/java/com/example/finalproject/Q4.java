package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Q4 extends AppCompatActivity {
    private TextView score = findViewById(R.id.score4);

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
        Intent intent = getIntent();
        String lastScore = intent.getStringExtra("score");
        score.setText(lastScore);
        final TextView correctAnswer = findViewById(R.id.correction4);
        correctAnswer.setVisibility(View.INVISIBLE);
        Button submit = findViewById(R.id.submit4);
        final Button next = findViewById(R.id.next4);
        next.setVisibility(View.INVISIBLE);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                TextView answer = findViewById(R.id.answer4);
                String input = answer.getText().toString();
                if (input.equals("Mary")) {
                    if (score.getText().toString().equals("0 / 100")) {
                        score.setText("25 / 100");
                    }
                    if (score.getText().toString().equals("25 / 100")) {
                        score.setText("50 / 100");
                    }
                    if (score.getText().toString().equals("50 / 100")) {
                        score.setText("75 / 100");
                    }
                    if (score.getText().toString().equals("75 / 100")) {
                        score.setText("100 / 100");
                    }
                    correctAnswer.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                } else {
                    if (score.getText().toString().equals("0 / 100")) {
                        score.setText("0 / 100");
                    }
                    if (score.getText().toString().equals("25 / 100")) {
                        score.setText("25 / 100");
                    }
                    if (score.getText().toString().equals("50 / 100")) {
                        score.setText("50 / 100");
                    }
                    if (score.getText().toString().equals("75 / 100")) {
                        score.setText("75 / 100");
                    }
                    correctAnswer.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent result = new Intent(Q4.this, MainActivity.class);
                String currentScore = score.getText().toString();
                result.putExtra("score", currentScore);
                startActivity(result);
            }
        });
    }
}
