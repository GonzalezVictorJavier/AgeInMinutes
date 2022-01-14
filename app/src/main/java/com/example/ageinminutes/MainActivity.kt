package com.example.ageinminutes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.selectDateButton) as Button
        button.setOnClickListener{
            Toast.makeText(this, "Button works", Toast.LENGTH_SHORT).show()
        }
    }


}