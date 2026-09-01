package com.aura.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
  private WebView webView;
  @Override public void onCreate(Bundle b){ super.onCreate(b); webView=new WebView(this); setContentView(webView); WebSettings s=webView.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setMixedContentMode(WebSettings.MIXED_CONTENT_COMPATIBILITY_MODE); webView.setWebViewClient(new WebViewClient()); webView.setWebChromeClient(new WebChromeClient()); webView.loadUrl("file:///android_asset/index.html"); }
  @Override public void onBackPressed(){ if(webView.canGoBack()) webView.goBack(); else super.onBackPressed(); }
}
