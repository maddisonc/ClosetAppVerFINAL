package com.example.closetappverfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.Viewholder> {
    private final Context context;
    private final ArrayList<Integer> integerArrayList;

    public recyclerViewAdapter(Context context, ArrayList<Integer> integerArrayList) {
        this.context = context;
        this.integerArrayList = integerArrayList;
    }

    @NonNull
    @Override

    public recyclerViewAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.activity_see_all_screen, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerViewAdapter.Viewholder holder, int position) {
        // use glide library to display images
        Glide.with(context)
                .load(integerArrayList.get(position))
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return integerArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.displayAllImg);
        }
    }
}
