package com.example.tech_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    String s1[],s2[];
    RecyclerView recyclerView;
    int images[]={R.drawable.burger,R.drawable.pizza,R.drawable.butter_chicken,R.drawable.pav_bhaji,R.drawable.fried_rice,R.drawable.masala_dosa,R.drawable.noodles,R.drawable.cake,R.drawable.coffee,R.drawable.milkshakes};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_menu);
        recyclerView=findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.Food_items);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}