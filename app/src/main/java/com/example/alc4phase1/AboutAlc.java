package com.example.alc4phase1;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {
    private static final String baseUrl = "https://andela.com/alc/";
    private WebView AboutAlc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        WebView webView = findViewById(R.id.load_url_web_view);
        AboutAlc.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        AboutAlc.loadUrl(baseUrl);
    }

    @Override
    public void onBackPressed() {
        if (AboutAlc.canGoBack()) {
            AboutAlc.goBack();
        } else {
            super.onBackPressed();
        }
    }

}

