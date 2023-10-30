package com.example.recyclerrr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<RecyclerrrItem> recyclerrrItems = new ArrayList<>();
        recyclerrrItems.add(new RecyclerrrItem(R.drawable.baseline_emoji_emotions_24,"Happy","Life is fun!"));
        recyclerrrItems.add(new RecyclerrrItem(R.drawable.baseline_sentiment_neutral_24,"Neutral","Life is bad("));
        recyclerrrItems.add(new RecyclerrrItem(R.drawable.baseline_mood_bad_24,"Neutral","Life is life"));
    }
}
