package com.example.newsland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class FoxActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fox);
        webView =findViewById(R.id.web_view_fox);
        webView.loadUrl("https://www.foxnews.com/");
        webView.setWebViewClient(new WebViewController());

    }
}