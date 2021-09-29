package com.argz.demo_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "POTATO";
    private ArrayList<String> names;
    private NamesAdapter namesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNames();
        initRecyclerView();
    }

    private void generateRandomNames() {
        names = new ArrayList<>();
        names.add("Potato");
        names.add("Tomato");
        names.add("Chicken");
        names.add("Bread");
        names.add("Avocado");
        names.add("Potato");
        names.add("Tomato");
        names.add("Chicken");
        names.add("Bread");
        names.add("Avocado");
        names.add("Potato");
        names.add("Tomato");
        names.add("Chicken");
        names.add("Bread");
        names.add("Avocado");
    }

    private void initRecyclerView() {
        RecyclerView rv_names = findViewById(R.id.rv_names);

        namesAdapter = new NamesAdapter(getApplicationContext(), names);

        rv_names.setLayoutManager(new LinearLayoutManager(this));
        rv_names.setAdapter(namesAdapter);
    }
}