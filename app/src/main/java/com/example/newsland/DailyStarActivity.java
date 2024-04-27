package com.example.newsland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DailyStarActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_star);
        webView =findViewById(R.id.web_view_daily);
        webView.loadUrl("https://bangla.thedailystar.net/");
        webView.setWebViewClient(new WebViewController());
    }
}