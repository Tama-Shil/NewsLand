package com.example.newsland;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kwabenaberko.newsapilib.models.Article;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsRecylerAdapter extends RecyclerView.Adapter<NewsRecylerAdapter.NewsViewHolder>{

    List<Article> articleList;

    public NewsRecylerAdapter(List<Article> articleList) {
        this.articleList = articleList;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_recycler_row,parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        Article article=articleList.get(position);
        holder.titleTextview.setText(article.getTitle());
        holder.sourceTextview.setText(article.getSource().getName());
        Picasso.get().load(article.getUrlToImage()).
                error(R.drawable.no_image).
                placeholder(R.drawable.no_image).
                into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(),NewsDetailActivity.class);
                i.putExtra("url",article.getUrl());
                v.getContext().startActivity(i);

            }
        });
    }
    void updateData(List<Article>data){
        articleList.clear();
        articleList.addAll(data);
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder{

        TextView titleTextview, sourceTextview;
        ImageView imageView;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextview=itemView.findViewById(R.id.artile_title);
            sourceTextview=itemView.findViewById(R.id.artile_source);
           imageView=itemView.findViewById(R.id.article_image_view);
        }
    }
}
