package com.liangyi.yueting;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class OnlineMusicActivity extends AppCompatActivity {
    private static final String URL_music163="https://music.163.com/";
    private WebView webView;
    private WebSettings webSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onlinemusic_activity);
        webView=(WebView)findViewById(R.id.webview);
        load_WebView();
    }
    public void load_WebView(){
        webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);//支持js
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(URL_music163);
    }

    @Override
    protected void onDestroy() {

        if (webView != null) {
            ((ViewGroup) webView.getParent()).removeView(webView);
            webView.destroy();
            webView = null;
        }
        super.onDestroy();
    }
}