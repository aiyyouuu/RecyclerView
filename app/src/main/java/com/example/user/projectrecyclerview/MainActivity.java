package com.example.user.projectrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTeam;
    private ArrayList<DisneyModel> listTeam = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeam = findViewById(R.id.rv);
        rvTeam.setHasFixedSize(true);
        listTeam.addAll(DisneyData.getListData());

        showRecyclerList();
    }

    private void showRecyclerList(){
        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        DisneyAdapter disneyAdapter = new DisneyAdapter(this);
        disneyAdapter.setDisneyModels(listTeam);
        rvTeam.setAdapter(disneyAdapter);
    }
}
