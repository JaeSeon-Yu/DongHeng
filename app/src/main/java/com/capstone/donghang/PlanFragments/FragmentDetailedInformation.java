package com.capstone.donghang.PlanFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.capstone.donghang.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetailedInformation extends Fragment {

    public FragmentDetailedInformation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detailed_information, container, false);
    }
}
