package com.example.pranayanand.ecellitemslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static ArrayList<Item> Items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] androidColors = getResources().getIntArray(R.array.androidcolors);


        RecyclerView rv= (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new MyAdapter(this,getData(), androidColors));
    }
    private ArrayList getData()
    {
        Items =new ArrayList<>();

        Item s=new Item();
        s.setName(R.string.article1);
        s.setData(R.string.article1_data);
        s.setImage(R.drawable.article1);
        Items.add(s);

        s=new Item();
        s.setName(R.string.article2);
        s.setData(R.string.article2_data);
        s.setImage(R.drawable.article2);
        Items.add(s);


        s=new Item();
        s.setName(R.string.article3);
        s.setData(R.string.article3_data);
        s.setImage(R.drawable.article3);
        Items.add(s);


        s=new Item();
        s.setName(R.string.article4);
        s.setData(R.string.article4_data);
        s.setImage(R.drawable.article4);
        Items.add(s);


        s=new Item();
        s.setName(R.string.article5);
        s.setData(R.string.article5_data);
        s.setImage(R.drawable.article5);
        Items.add(s);


        s=new Item();
        s.setName(R.string.article6);
        s.setData(R.string.article6_data);
        s.setImage(R.drawable.article6);
        Items.add(s);


        s=new Item();
        s.setName(R.string.article7);
        s.setData(R.string.article7_data);
        s.setImage(R.drawable.article7);
        Items.add(s);


        s=new Item();
        s.setName(R.string.article8);
        s.setData(R.string.article8_data);
        s.setImage(R.drawable.article8);
        Items.add(s);


        s=new Item();
        s.setName(R.string.article9);
        s.setData(R.string.article9_data);
        s.setImage(R.drawable.article9);
        Items.add(s);


        s=new Item();
        s.setName(R.string.article10);
        s.setData(R.string.article10_data);
        s.setImage(R.drawable.article10);
        Items.add(s);

        return Items;
    }
}
