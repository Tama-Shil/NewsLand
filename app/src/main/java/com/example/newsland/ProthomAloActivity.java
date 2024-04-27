package com.example.newsland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ProthomAloActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prothom_alo);
        webView =findViewById(R.id.web_view_prothom);
        webView.loadUrl("https://www.prothomalo.com/");
        webView.setWebViewClient(new WebViewController());
    }
}