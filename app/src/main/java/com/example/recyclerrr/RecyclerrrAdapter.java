package com.example.recyclerrr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.AccessController;

public class RecyclerrrAdapter extends RecyclerView.Adapter<RecyclerrrAdapter.RecyclerrrViewHoider> {
    public static class RecyclerrrViewHoider extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;
        public RecyclerrrViewHoider(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }

    @NonNull
    @Override
    public RecyclerrrViewHoider onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler, viewGroup, false);
        RecyclerrrViewHoider recyclerrrViewHoider = new RecyclerrrViewHoider(view);
        return recyclerrrViewHoider;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerrrViewHoider holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
