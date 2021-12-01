package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var kotlinB:Button
    lateinit var  androidB:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinB = findViewById(R.id.Kotlin)
        androidB = findViewById(R.id.Android)

        kotlinB.setOnClickListener{

            val intent = Intent(this, Kotlin_Review::class.java)
            startActivity(intent)
        }
        androidB.setOnClickListener{
            val intent = Intent(this, Android_Review::class.java)
            startActivity(intent)
        }
    }
}