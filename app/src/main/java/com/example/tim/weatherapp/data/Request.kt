package com.example.tim.weatherapp.data

import android.util.Log
import java.net.URL

class Request(private val url: String) {

    fun run() {
        val foreCastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, foreCastJsonStr);
    }
}