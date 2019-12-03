package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RPC2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpc2);
        Intent intent = getIntent();
        TextView userName = findViewById(R.id.helloUser);
        String user = intent.getStringExtra("Username");
        if (!user.equals("")) {
            userName.setText("Hello! " + user);
        } else {
            userName.setText("Hello! Player");
        }
        TextView welcome = findViewById(R.id.welcome);
        welcome.setText("Welcome to our IQ test!");
        TextView ready = findViewById(R.id.ready);
        ready.setText("Are you ready?");
        Button yes = findViewById(R.id.yes);
        Button no = findViewById(R.id.no);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            // the user does not want play -> go back to main menu
            public void onClick(View view) {
                Intent previous = new Intent(RPC2.this, MainActivity.class);
                startActivity(previous);
                finish();
            }
        });
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            // the user chooses to play -> go to question1
            public void onClick(View view) {
                Intent question1 = new Intent(RPC2.this, Q1.class);
                startActivity(question1);
                finish();
            }
        });
    }
}
