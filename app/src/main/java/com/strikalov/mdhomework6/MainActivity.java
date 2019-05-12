package com.strikalov.mdhomework6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ImageRecyclerViewAdapter imageRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<Integer> imageNumbersList = createImageNumbersList();

        recyclerView = findViewById(R.id.recycler_view);
        imageRecyclerViewAdapter = new ImageRecyclerViewAdapter(imageNumbersList);
        recyclerView.setAdapter(imageRecyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Integer> createImageNumbersList(){

        List<Integer> imageNumbersList = new ArrayList<>();
        imageNumbersList.add(1);
        imageNumbersList.add(2);
        imageNumbersList.add(3);
        imageNumbersList.add(4);
        imageNumbersList.add(5);
        imageNumbersList.add(6);

        return imageNumbersList;
    }
}
