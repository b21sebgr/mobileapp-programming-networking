package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MountainAdapter extends RecyclerView.Adapter<MountainAdapter.MountainAdapterViewHolder> {

    private List<Mountain> mountains;

    public MountainAdapter(List<Mountain> mountains) {
        this.mountains = mountains;
    }

    public class MountainAdapterViewHolder extends RecyclerView.ViewHolder {

        private TextView mountain_name;

        public MountainAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            mountain_name = itemView.findViewById(R.id.mountain_name);
        }
    }

    @NonNull
    @Override
    public MountainAdapter.MountainAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MountainAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MountainAdapter.MountainAdapterViewHolder holder, int position) {
        holder.mountain_name.setText(mountains.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public void setMountains(List<Mountain> mountains) {
        this.mountains = mountains;
    }
}
