package com.example.closetappverfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class seeAllScreen extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutmanager;
    String[] programNameList = {"White shirt", "Black turtleneck", "Blue jeans", "Red slacks", "Purple skirt"};
    String[] programDescriptionList = {"casual, hot weather", "formal, cold weather", "casual, any weather",
            "formal, any weather", "casual, hot weather"};
    // Define an integer array to hold the image recourse ids
    int[] programImages = {R.drawable.whitetee, R.drawable.blackturtle,
            R.drawable.bluejeans, R.drawable.redslacks, R.drawable.purpleskirt};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_all_screen);
        recyclerView = findViewById(R.id.rvProgram);
        recyclerView.setHasFixedSize(true);
        layoutmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);
        programAdapter = new ProgramAdapter(this, programNameList, programDescriptionList, programImages);
        recyclerView.setAdapter(programAdapter);
    }
}