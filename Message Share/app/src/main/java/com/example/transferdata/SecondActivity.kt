package com.example.transferdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //get intent data
        val intent = intent
        val message = intent.getStringExtra(MainActivity.MESSAGE_ID)
        //textView
        val resultTv = findViewById<TextView>(R.id.resultTv)
        //setText
        resultTv.text = message
    }
}