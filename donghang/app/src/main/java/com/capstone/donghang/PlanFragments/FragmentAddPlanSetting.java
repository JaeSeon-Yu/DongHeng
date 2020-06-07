package com.capstone.donghang.PlanFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.capstone.donghang.R;

public class FragmentAddPlanSetting extends Fragment {
    EditText editPlanName;
    MultiAutoCompleteTextView editTag;
    Button btnNext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_addplan_setting, container, false);

        editPlanName = view.findViewById(R.id.editPlanName);
        editTag = view.findViewById(R.id.editTag);
        btnNext = view.findViewById(R.id.btnNext);

        final String[] Tags = {"힐링","온천","제주","서울근교","국내여행","바람","맛집"};
        ArrayAdapter<String> TagsAdapter = new ArrayAdapter<String>(view.getContext(),android.R.layout.simple_dropdown_item_1line,Tags);

        editTag.setAdapter(TagsAdapter);
        editTag.setThreshold(1);
        editTag.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(container.getId(),new FragmentSelectDay()).commit();
            }
        });



        return view;
    }
}
