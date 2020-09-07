package com.example.transferdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object{
        const val MESSAGE_ID = "com.example.transferdata.MESSAGE_ID"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)

        //Handle button click
        button.setOnClickListener {
            val message = editText.text.toString()

            //intent to start activity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(MESSAGE_ID,message)
            startActivity(intent)
        }
    }
}