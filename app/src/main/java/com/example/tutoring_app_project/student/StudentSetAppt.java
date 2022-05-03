package com.example.tutoring_app_project.student;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.Toast;

import com.example.tutoring_app_project.R;
import com.example.tutoring_app_project.databinding.FragmentStudentActivityContentBinding;
import com.example.tutoring_app_project.databinding.FragmentStudentSetApptBinding;

public class StudentSetAppt extends Fragment {

    private FragmentStudentSetApptBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentStudentSetApptBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.MainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(StudentSetAppt.this)
                        .navigate(R.id.action_studentSetAppt_to_studentActivityContent);
            }
        });

        binding.setbutton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                    boolean checked = ((Checkable) view).isChecked();
                    int x = 0;
                    NavHostFragment.findNavController(StudentSetAppt.this);

                    switch(view.getId()) {
                        case R.id.checkBoxMatt:
                            if (checked){
                                NavHostFragment.findNavController(StudentSetAppt.this)
                                        .navigate(R.id.action_studentSetAppt_to_studentViewAppt);

                            }
                            break;
                        case R.id.checkBox2Sam:
                            if (checked){
                                NavHostFragment.findNavController(StudentSetAppt.this)
                                        .navigate(R.id.action_studentSetAppt_to_studentViewAppt);
                            }

                            break;
                    }


            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;

    }
}