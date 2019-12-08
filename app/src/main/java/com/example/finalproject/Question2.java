package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Button next = findViewById(R.id.next2);
        Intent intent = getIntent();
        String lastScore = intent.getStringExtra("score");
        final TextView score = findViewById(R.id.score2);
        score.setText(lastScore);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Intent question3 = new Intent(Question2.this, Q3.class);
                String currentScore = score.getText().toString();
                question3.putExtra("score", currentScore);
                startActivity(question3);
                finish();
            }
        });
    }
}
