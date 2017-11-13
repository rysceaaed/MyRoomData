package com.atiscom.recyclerviewroomdatabase;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "production").allowMainThreadQueries().build();

//
//        for (int i = 0; i <10 ; i++) {
//            CarModel model = new CarModel("Astra","10");
//            db.carDao().insertAll(model);
//        }

        List<CarModel> carModelList =  db.carDao().getAll();

        adapter = new RecyclerAdapter(carModelList);
        recyclerView.setAdapter(adapter);

    }
}
