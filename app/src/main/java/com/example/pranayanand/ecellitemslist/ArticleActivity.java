package com.example.pranayanand.ecellitemslist;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ArticleActivity extends AppCompatActivity {
    ImageView image;
    TextView heading, data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        Typeface font = Typeface.createFromAsset(getAssets(), "VarelaRound-Regular.ttf");
        image = (ImageView) findViewById(R.id.image);
        heading = (TextView) findViewById(R.id.heading);
        data= (TextView) findViewById(R.id.data);
        heading.setTypeface(font);
        data.setTypeface(font);
        Intent i = getIntent();
        int position = i.getIntExtra("position", 0);
        heading.setText(MainActivity.Items.get(position).getName());
        data.setText(MainActivity.Items.get(position).getData());
        Glide.with(getApplicationContext()).load(MainActivity.Items.get(position).getImage()).into(image);
    }
}
