package com.example.tutoring_app_project;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener());
        Button button1 = findViewById(R.id.button);
        Button button2 = findViewById(R.id.LogButton);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent intent = new Intent(this, ActivityTest.class);
                startActivity(intent);
                break;
            case R.id.LogButton:
                Intent intent2 = new Intent(this, ActivityExam.class);
                startActivity(intent2);
                break;
        }
    }
}