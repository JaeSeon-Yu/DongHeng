package com.capstone.donghang.PlanFragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.capstone.donghang.R;

import java.util.List;

public class DetailInfo_RecyclerAdapter extends RecyclerView.Adapter<DetailInfo_RecyclerAdapter.ViewHolder> {

    List<DetailInfo_Section> sectionList;
    Context context;
    public DetailInfo_RecyclerAdapter(List<DetailInfo_Section> sectionList, Context context) {
        this.sectionList = sectionList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.fragment_detailed_information_recyclerview_section, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DetailInfo_Section section = sectionList.get(position);
        String sectionDate = section.getDate();
        List<DetailInfo_Item> items = section.getItem();

        holder.sectionName.setText(sectionDate);

        DetailInfo_ChildRecyclerAdapter childRecyclerAdapter = new DetailInfo_ChildRecyclerAdapter(items);
        holder.recyclerView.setAdapter(childRecyclerAdapter);

    }

    @Override
    public int getItemCount() {
        return sectionList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView sectionName;
        RecyclerView recyclerView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            sectionName = itemView.findViewById(R.id.sectionDate);
            recyclerView = itemView.findViewById(R.id.childRecyclerView);
            recyclerView.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL));
        }
    }
}
