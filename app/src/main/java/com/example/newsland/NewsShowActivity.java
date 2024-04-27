package com.example.newsland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class NewsShowActivity extends AppCompatActivity {

    TextView titleTextview, sourceTextview;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_show);

        titleTextview=findViewById(R.id.artile_title);
        sourceTextview=findViewById(R.id.artile_source);
        imageView=findViewById(R.id.article_image_view);

    }
}