package com.example.tutoring_app_project.student;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tutoring_app_project.R;
import com.example.tutoring_app_project.databinding.FragmentStudentActivityContentBinding;

public class StudentActivityContent extends Fragment {

    private FragmentStudentActivityContentBinding  binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentStudentActivityContentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.SetAppointmentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(StudentActivityContent.this)
                        .navigate(R.id.action_studentActivityContent_to_studentSetAppt);
            }
        });

        binding.CheckAppointmentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(StudentActivityContent.this)
                        .navigate(R.id.action_studentActivityContent_to_studentViewAppt);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}