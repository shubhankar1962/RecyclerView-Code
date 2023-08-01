package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private List<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Prepare data for the RecyclerView
        dataList = new ArrayList<>();
        dataList.add("Entry 1");
        dataList.add("Entry 2");
        dataList.add("Entry 3");
        dataList.add("Entry 4");

        // Create and set the adapter
        adapter = new RecyclerViewAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }
}
