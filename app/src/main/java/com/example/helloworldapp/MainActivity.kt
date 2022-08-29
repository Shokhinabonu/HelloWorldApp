package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton=findViewById<Button>(R.id.ButtonText)
        myButton.setOnClickListener{
           Log.v("Hello World", "Button was clicked")
           Toast.makeText(this,"Hello to you too!", Toast.LENGTH_SHORT).show()
        }
    }
}