package com.example.bodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.bodia.adapter.RecAdapter;
import com.example.bodia.model.Item;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Item> arrOfItem;
    List<String> arrOfDesc;
    List<Integer> arrOfImg;
    List<String> arrOfDesc2;
    List<Integer> arrOfImg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrOfItem= new ArrayList<>();
        arrOfImg= new ArrayList<>();
        arrOfDesc= new ArrayList<>();
        arrOfImg2= new ArrayList<>();
        arrOfDesc2= new ArrayList<>();
        Item item;

        for(int i=0; i<200; i++){
            arrOfImg.add(R.mipmap.ic_launcher_round);
        }

        for(int i=0; i<200; i++){
            arrOfDesc.add("Text....."+i+"...");
        }

        for(int i=0; i<200; i++){
            arrOfImg2.add(R.mipmap.ic_launcher_round);
        }

        for(int i=0; i<200; i++){
            arrOfDesc2.add("Text....."+i+"...");
        }

        for(int i=0; i<200; i++){
            item=new Item(arrOfImg.get(i),arrOfDesc.get(i),arrOfImg2.get(i),arrOfDesc2.get(i));
            arrOfItem.add(item);
        }


        RecyclerView recyclerView= findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecAdapter recAdapter = new RecAdapter(arrOfItem);
        recyclerView.setAdapter(recAdapter);
    }
}