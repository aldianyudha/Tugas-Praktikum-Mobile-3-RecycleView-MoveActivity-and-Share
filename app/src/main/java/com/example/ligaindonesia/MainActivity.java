package com.example.ligaindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvClubIndo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvClubIndo = findViewById(R.id.rv_club);
        rvClubIndo.setHasFixedSize(true);

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvClubIndo.setLayoutManager(new LinearLayoutManager(this));

        ClubAdapter listClubsAdapter = new ClubAdapter(ClubData.getClubList(),getApplicationContext());
        rvClubIndo.setLayoutManager(new LinearLayoutManager(this));
        rvClubIndo.setAdapter(listClubsAdapter);

    }
}
