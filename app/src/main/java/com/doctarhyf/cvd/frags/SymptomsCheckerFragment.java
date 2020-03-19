package com.doctarhyf.cvd.frags;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.doctarhyf.cvd.R;

public class SymptomsCheckerFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_sympt_checker, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        textView.setText("Symptoms Checker");

        return root;
    }
}