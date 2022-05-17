package com.baolan2005.bldemowebsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MTDMainActivity extends AppCompatActivity {

    private WebView mtdWebView;
    private WebViewClient mtdViewClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtdmain);

        mtdWebView = findViewById(R.id.mtdWebview);
        mtdViewClient = new WebViewClient();
        mtdWebView.setWebViewClient(mtdViewClient);
        mtdWebView.loadUrl("https://apple.com");
    }
}