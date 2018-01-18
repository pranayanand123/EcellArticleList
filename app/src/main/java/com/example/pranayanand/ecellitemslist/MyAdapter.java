package com.example.pranayanand.ecellitemslist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;


import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Pranay Anand on 18-01-2018.
 */

class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    RecyclerViewClickListener listener;

    TextView nameTxt,propellantTxt;
    public LinearLayout linearLayout;

    ImageView img;

    public MyViewHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
        img= (ImageView) itemView.findViewById(R.id.imageView);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        itemView.setOnClickListener(this);
    }
    public void setRecyclerViewClickListener(RecyclerViewClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        listener.onClick(view, getAdapterPosition());

    }
}

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private RecyclerViewClickListener mListener;
    private int[] androidColors;

    Context c;
    ArrayList<Item> Items;


    public MyAdapter(Context c, ArrayList<Item> Items, int[] androidColors) {
        this.c = c;
        this.Items = Items;
        this.androidColors = androidColors;
    }



    //VIEW ITEM
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        int randomColor = androidColors[new Random().nextInt(androidColors.length)];
        holder.linearLayout.setBackgroundColor(randomColor);


        //CURRENT Item
        Item s=Items.get(position);

        //BIND DATA
        holder.nameTxt.setText(s.getName());
        Glide.with(c).load(s.getImage()).into(holder.img);
        holder.setRecyclerViewClickListener(new RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(c, ArticleActivity.class);
                intent.putExtra("position", position);
                c.startActivity(intent);
            }
        });


    }

    //TOTAL ItemS
    @Override
    public int getItemCount() {
        return Items.size();
    }






}
