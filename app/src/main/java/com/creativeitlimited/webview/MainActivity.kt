package com.creativeitlimited.webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.webkit.WebViewClient
import android.window.OnBackInvokedDispatcher
import com.creativeitlimited.webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.webView.webViewClient= WebViewClient()
//        binding.webView.loadUrl("https://flixhq.bz/")
//        binding.webView.settings.javaScriptEnabled=true

        binding.webView.apply {
            webViewClient= WebViewClient()
            loadUrl("https://openlibrary.org/")
            settings.javaScriptEnabled=true
        }

    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {

        if (binding.webView.canGoBack()) {
            binding.webView.goBack()
        }else{
        super.onBackPressed()
    }
    }
}