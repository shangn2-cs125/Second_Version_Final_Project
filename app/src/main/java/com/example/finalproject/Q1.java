package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
import android.os.Bundle;
//import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import java.util.Timer;

public class Q1 extends AppCompatActivity {
    //private static final int myTime = 10;
    //private CountDownTimer Timer;
    //private TextView time = findViewById(R.id.time);
    private String Q1 = "You are in a running race. You excel the second place. Which place are you in?";
    private String Q2 = "You are in a running race. You excel the last one. Which place are you in?";
    private String Q3 = "Calculate: what is 1000 + 40 + 1000 + 30 + 1000 + 20 + 1000 + 10?";
    private String Q4 = "It's Mary! Read the question again!";
    private Button next = findViewById(R.id.next1);
    private TextView title = findViewById(R.id.title);
    private String challenge = "Challenge ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        final TextView score = findViewById(R.id.score1);
        final TextView correction = findViewById(R.id.correction1);
        score.setText("0 / 100");
        Button submit = findViewById(R.id.submit1);
        next.setVisibility(View.INVISIBLE);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                TextView answer = findViewById(R.id.answer1);
                String input = answer.getText().toString();
                if (title.toString().equals(challenge + "#1")) {
                    if (input.equals("2")) {
                        score.setText("25 / 100");
                        correction.setVisibility(View.VISIBLE);
                        next.setVisibility(View.VISIBLE);
                    } else {
                        score.setText("0 / 100");
                        correction.setVisibility(View.VISIBLE);
                        next.setVisibility(View.VISIBLE);
                    }
                } else if (title.toString().equals(challenge + "#2")) {
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
                } else if (title.toString().equals(challenge + "#3")) {
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
                        correction.setVisibility(View.VISIBLE);
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
                        correction.setVisibility(View.VISIBLE);
                        next.setVisibility(View.VISIBLE);
                    }
                } else if (title.toString().equals(challenge + "#4")) {
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
                        correction.setVisibility(View.VISIBLE);
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
                        correction.setVisibility(View.VISIBLE);
                        next.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                updateUI();
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

    /** Refresh the screen that user is working on.*/
    private void updateUI() {
        TextView question = findViewById(R.id.question);
        next.setVisibility(View.INVISIBLE);
        if (question.getText().toString().equals(Q1)) {
            title.setText(challenge + "#2");
            question.setText((Q2));
        } else if (question.getText().toString().equals(Q2)) {
            title.setText((challenge + "#3"));
            question.setText(Q3);
        } else if (question.getText().toString().equals(Q3)) {
            title.setText(challenge + "#4");
            question.setText(Q4);
        } else if (question.getText().toString().equals(Q4)) {
            return;
        }
        EditText answer = findViewById(R.id.answer1);
        answer.setText("");
    }
}
