package com.rafael.pimenta.hellowordkmm.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rafael.pimenta.hellowordkmm.Greeting
import android.widget.TextView
import com.rafael.pimenta.hellowordkmm.Platform

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = "Olá mundo, ${Platform().platform}!"
    }
}
