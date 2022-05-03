package com.example.tutoring_app_project.student;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tutoring_app_project.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StudentViewAppt#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StudentViewAppt extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_student_view_appt, container, false);
        return view;


    }
}