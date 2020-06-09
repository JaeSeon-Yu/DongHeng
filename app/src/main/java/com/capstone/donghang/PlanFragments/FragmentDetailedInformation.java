package com.capstone.donghang.PlanFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.capstone.donghang.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetailedInformation extends Fragment {
    List<DetailInfo_Section> sectionList = new ArrayList<>();

    public FragmentDetailedInformation() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detailed_information, container, false);

        initData();

        RecyclerView recyclerView = view.findViewById(R.id.mainRecyclerView);
        DetailInfo_RecyclerAdapter recyclerAdapter = new DetailInfo_RecyclerAdapter(sectionList,getContext());
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL)); // 구분선

        return view;
        }

                    void initData() {
                        int[] count = new int[]{2,3,2}; // 각 여행날짜에 들어가 있는 여행지들의 개수
                        ArrayList<DetailInfo_Item> item; // 여행지를 담는 리스트

                        for ( int cnt = 0 ; cnt < count.length ; cnt ++) {
                            item = new ArrayList<>(); // 단일 여행지 리스트

                            /* 여행지를 추가하여 여행지 리스트를 만들기 */
                            for (int i = 0; i < count[cnt]; i++) {
                    item.add(new DetailInfo_Item("장소" + (i + 1), "주소" + (i + 1)));
                }

            sectionList.add(new DetailInfo_Section((cnt+1)+"번째",item)); // 완성된 여행지 리스트를 담는 리스트에 추가

        }


    }
}
