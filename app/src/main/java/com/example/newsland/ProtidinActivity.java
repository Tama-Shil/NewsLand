package com.example.newsland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ProtidinActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protidin);
        webView =findViewById(R.id.web_view_protidin);
        webView.loadUrl("https://www.bd-pratidin.com/");
        webView.setWebViewClient(new WebViewController());
    }
}