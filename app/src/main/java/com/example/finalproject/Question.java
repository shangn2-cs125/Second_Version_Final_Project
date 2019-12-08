package com.example.finalproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
import android.content.DialogInterface;
import android.os.Bundle;
//import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import java.util.Timer;

public class Question extends AppCompatActivity {
    //private static final int myTime = 10;
    //private CountDownTimer Timer;
    //private TextView time = findViewById(R.id.time);
    private String Q1 = "You are in a running race. You excel the second place. Which place are you in?";
    private String Q2 = "You are in a running race. You excel the last one. Which place are you in?";
    private String Q3 = "Calculate: what is 1000 + 40 + 1000 + 30 + 1000 + 20 + 1000 + 10?";
    private String Q4 = "It's Mary! Read the question again!";
    private String challenge = "Challenge ";
    private Button submit;
    private TextView title;
    private TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        final String C1 = challenge + "#1";
        final String C2 = challenge + "#2";
        final String C3 = challenge + "#3";
        final String C4 = challenge + "#4";
        title = findViewById(R.id.title);
        submit = findViewById(R.id.submit);
        score = findViewById(R.id.score);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                TextView answer = findViewById(R.id.answer);
                String Title = title.getText().toString();
                String Answer = answer.getText().toString();
                if (Title.equals(C1)) {
                    if (!Answer.equals("2")) {
                        showMyDialog();
                    } else {
                        openDialog();
                        updateUI();
                    }
                }
                if (Title.equals(C2)) {
                    if (!Answer.equals("I cannot do that")) {
                        showMyDialog();
                    } else {
                        openDialog();
                        updateUI();
                    }
                }
                if (Title.equals(C3)) {
                    if (!Answer.equals("4100")) {
                        showMyDialog();
                    } else {
                        openDialog();
                        updateUI();
                    }
                }
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

    /** pop.*/
    private void showMyDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Question.this);
        builder.setTitle("Opps!").setMessage("You shall put something much better than that!").
                setPositiveButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        builder.create().show();
    }


    /** Cheers with the user.*/
    private void openDialog() {
        Dialog dialog = new Dialog();
        dialog.show(getSupportFragmentManager(), "Hello");
    }

    /** Refresh the screen that user is working on.*/
    private void updateUI() {
        TextView question = findViewById(R.id.question);
        TextView title = findViewById(R.id.title);
        String challenge = "Challenge ";
        if (question.getText().toString().equals(Q1)) {
            title.setText(challenge + "#2");
            question.setText((Q2));
            score.setText("25/100");
        } else if (question.getText().toString().equals(Q2)) {
            title.setText((challenge + "#3"));
            question.setText(Q3);
            score.setText("50/100");
        } else if (question.getText().toString().equals(Q3)) {
            title.setText(challenge + "#4");
            question.setText(Q4);
            score.setText("75/100");
        } else if (question.getText().toString().equals(Q4)) {
            return;
        }
        EditText answer = findViewById(R.id.answer);
        answer.setText("");
    }
}
