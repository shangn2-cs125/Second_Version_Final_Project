package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Q3 extends AppCompatActivity {

    private TextView score = findViewById(R.id.score3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        Intent intent = getIntent();
        String lastScore = intent.getStringExtra("score");
        score.setText(lastScore);
        final TextView correctAnswer = findViewById(R.id.correction3);
        correctAnswer.setVisibility(View.INVISIBLE);
        Button submit = findViewById(R.id.submit3);
        final Button next = findViewById(R.id.next3);
        next.setVisibility(View.INVISIBLE);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                TextView answer = findViewById(R.id.answer3);
                String input = answer.getText().toString();
                if (input.equals("4100")) {
                    if (score.getText().toString().equals("0 / 100")) {
                        score.setText("25 / 100");
                    }
                    if (score.getText().toString().equals("25 / 100")) {
                        score.setText("50 / 100");
                    }
                    if (score.getText().toString().equals("50 / 100")) {
                        score.setText("75 / 100");
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
                    correctAnswer.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent question4 = new Intent(Q3.this, Q4.class);
                String currentScore = score.getText().toString();
                question4.putExtra("score", currentScore);
                startActivity(question4);
            }
        });
    }
}
