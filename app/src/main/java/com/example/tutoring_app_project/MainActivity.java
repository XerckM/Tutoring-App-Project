package com.example.tutoring_app_project;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.tutoring_app_project.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSI;
    private Button buttonLI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSI = (Button) findViewById(R.id.button);
        buttonSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityTest();
            }
        });

        buttonLI = (Button) findViewById(R.id.button3);
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