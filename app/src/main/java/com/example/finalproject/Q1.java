package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import java.util.Timer;

public class Q1 extends AppCompatActivity {
    //private static final int myTime = 10;
    //private CountDownTimer Timer;
    //private TextView time = findViewById(R.id.time);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        final TextView score = findViewById(R.id.score);
        final TextView correction = findViewById(R.id.correction);
        final Button next = findViewById(R.id.next);
        score.setText("0 / 100");
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                TextView answer = findViewById(R.id.answer);
                String input = answer.getText().toString();
                if (input.equals("2")) {
                    score.setText("25 / 100");
                    correction.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                } else {
                    score.setText("0 / 100");
                    correction.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent question2 = new Intent(Q1.this, Q2.class);
                String currentScore = score.getText().toString();
                question2.putExtra("score", currentScore);
                startActivity(question2);
            }
        });
        /*if (isTimeUp()) {
            // Terminate the game and pop up the dialog says game over//
        }
    }
    /** test if the timer is down.
     */
    /*public boolean isTimeUp() {
        if (time.toString().equals("00:00")) {
            return true;
        } else {
            return false;
        }*/
    }
}
