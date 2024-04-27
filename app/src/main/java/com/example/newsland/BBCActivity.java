package com.example.newsland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class BBCActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbcactivity);

        webView =findViewById(R.id.web_view_bbc);
        webView.loadUrl("https://www.bbc.com/news");
        webView.setWebViewClient(new WebViewController());

    }
}