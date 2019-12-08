package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Q2 extends AppCompatActivity {
    private TextView score = findViewById(R.id.score2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        Intent intent = getIntent();
        String lastScore = intent.getStringExtra("score");
        score.setText(lastScore);
        final TextView correction = findViewById(R.id.correction2);
        correction.setVisibility(View.INVISIBLE);
        Button submit = findViewById(R.id.submit2);
        final Button next = findViewById(R.id.next2);
        next.setVisibility(View.INVISIBLE);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                TextView answer = findViewById(R.id.answer2);
                String input = answer.getText().toString();
                if (input.equals("")) {
                    if (score.getText().toString().equals("0 / 100")) {
                        score.setText("25 / 100");
                    }
                    if (score.getText().toString().equals("25 / 100")) {
                        score.setText("50 / 100");
                    }
                    correction.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                } else {
                    if (score.getText().toString().equals("0 / 100")) {
                        score.setText("0 / 100");
                    }
                    if (score.getText().toString().equals("25 / 100")) {
                        score.setText("25 / 100");
                    }
                    correction.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent question3 = new Intent(Q2.this, Q3.class);
                String currentScore = score.getText().toString();
                question3.putExtra("score", currentScore);
                startActivity(question3);
                finish();
            }
        });
    }
}
