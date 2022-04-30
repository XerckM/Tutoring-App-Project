package com.example.tutoring_app_project;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSI;
    private Button buttonLI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonSI = findViewById(R.id.button);
        buttonSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityTest();
            }
        });

        buttonLI = (Button) findViewById(R.id.LogButton);
        buttonLI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityLogin();
            }
        });


    }

    public void openActivityTest(){
        Intent intent = new Intent(this, ActivityTest.class);
        startActivity(intent);
    }

    public void openActivityLogin(){
        Intent intent2 = new Intent(this, ActivitlyLogin.class);
        startActivity(intent2);

    }
}