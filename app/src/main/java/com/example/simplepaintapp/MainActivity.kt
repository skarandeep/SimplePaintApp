package com.example.simplepaintapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton = findViewById<ImageButton>(R.id.redColor)
        val blueButton = findViewById<ImageButton>(R.id.blueColor)
        val blackButton = findViewById<ImageButton>(R.id.blueColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)

        redButton.setOnClickListener {

        }
        blueButton.setOnClickListener {

        }
        blackButton.setOnClickListener {

        }
        eraser.setOnClickListener {

        }

    }
}