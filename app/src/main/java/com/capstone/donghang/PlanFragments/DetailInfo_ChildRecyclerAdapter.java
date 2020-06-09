package com.capstone.donghang.PlanFragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.capstone.donghang.R;

import java.util.List;

public class DetailInfo_ChildRecyclerAdapter extends RecyclerView.Adapter<DetailInfo_ChildRecyclerAdapter.ViewHolder> {
    List<DetailInfo_Item> items;

    public DetailInfo_ChildRecyclerAdapter(List<DetailInfo_Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.fragment_detailed_information_recyclerview_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.place.setText(items.get(position).getItem());
        holder.address.setText(items.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView place,address;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            place = itemView.findViewById(R.id.itemTv);
            address = itemView.findViewById(R.id.addressTv);
        }
    }
}
