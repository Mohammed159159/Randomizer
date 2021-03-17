package com.example.randomize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsText = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener{
            var rand = Random.nextInt(seekBar.progress)
            resultsText.text = if(rand == 0) 1.toString() else rand.toString()
        }
    }
}