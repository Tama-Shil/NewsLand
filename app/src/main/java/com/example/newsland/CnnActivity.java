package com.example.newsland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class CnnActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnn);
        webView =findViewById(R.id.web_view_cnn);
        webView.loadUrl("https://edition.cnn.com/");
        webView.setWebViewClient(new WebViewController());
    }
}