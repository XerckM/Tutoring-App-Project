package com.example.tutoring_app_project.tutor;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tutoring_app_project.R;
import com.example.tutoring_app_project.databinding.FragmentStudentActivityContentBinding;
import com.example.tutoring_app_project.databinding.FragmentTutorActivityContentBinding;
import com.example.tutoring_app_project.student.StudentActivityContent;

public class TutorActivityContent extends Fragment {

    private FragmentTutorActivityContentBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentTutorActivityContentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.TutorSetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(TutorActivityContent.this)
                        .navigate(R.id.action_tutorActivityContent_to_tutorSetSchedule);
            }
        });

        binding.TutorViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(TutorActivityContent.this)
                        .navigate(R.id.action_tutorActivityContent_to_tutorViewSchedule);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}