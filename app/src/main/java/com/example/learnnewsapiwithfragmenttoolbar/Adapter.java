package com.example.learnnewsapiwithfragmenttoolbar;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    Context context;
    ArrayList<Pojo.articles> pojos;

    public Adapter(Context context, ArrayList<Pojo.articles> pojos) {
        this.context = context;
        this.pojos = pojos;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.cardviewdesign,null,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
//
        int a=position;
        holder.title.setText(pojos.get(position).getTitle());
        holder.descrip.setText(pojos.get(position).getDescription());
        holder.author.setText(pojos.get(position).getAuthor());
        Glide.with(context).load(pojos.get(position).getUrlToImage()).into(holder.imageView);
holder.title.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(context,NewsDetailPage.class);
        intent.putExtra("url",pojos.get(a).getUrl());
        context.startActivity(intent);
    }
});


    }

    @Override
    public int getItemCount() {
        return pojos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView author,title,descrip;
        ImageView imageView;
        CardView cardView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            author=itemView.findViewById(R.id.author);
            title=itemView.findViewById(R.id.title);
            descrip=itemView.findViewById(R.id.texturlid);
            imageView=itemView.findViewById(R.id.imageid);
            cardView=itemView.findViewById(R.id.card);
        }
    }
}
