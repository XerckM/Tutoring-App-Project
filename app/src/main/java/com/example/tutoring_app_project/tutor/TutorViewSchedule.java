package com.example.tutoring_app_project.tutor;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tutoring_app_project.R;
import com.example.tutoring_app_project.databinding.FragmentTutorSetScheduleBinding;
import com.example.tutoring_app_project.databinding.FragmentTutorViewScheduleBinding;

public class TutorViewSchedule extends Fragment {

    private FragmentTutorViewScheduleBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentTutorViewScheduleBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.TutorViewMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(TutorViewSchedule.this)
                        .navigate(R.id.action_tutorViewSchedule_to_tutorActivityContent);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}