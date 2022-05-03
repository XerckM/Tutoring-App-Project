package com.example.tutoring_app_project.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tutoring_app_project.R;

public class StudentActivity extends AppCompatActivity {

    Button SetApptButton, CheckApptButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        SetApptButton = findViewById(R.id.SetAppointmentsButton);
        CheckApptButton = findViewById(R.id.CheckAppointmentsButton);

        SetApptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new StudentSetAppt());
            }
        });

        CheckApptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new StudentViewAppt());
            }
        });
    }

    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainerView, fragment);
        fragmentTransaction.commit();
    }
}