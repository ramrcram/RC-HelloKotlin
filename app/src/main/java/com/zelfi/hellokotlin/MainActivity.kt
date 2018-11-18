package com.zelfi.hellokotlin

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prepareView()
    }

    private fun prepareView(){
        welcomeText.setText("Nice job Ramesh !... \n You made your first Kotlin ")
        //webView.webViewClient = MyWebViewClient()
        //webView.loadUrl("https://www.google.com")
        /*button.setOnClickListener({

        })*/
    }
}


class MyWebViewClient: WebViewClient(){
    override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
        view?.loadUrl(request?.url.toString())
        return true
    }
}