package com.example.workouttracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class workout2 : AppCompatActivity() {

    //back button
    lateinit var backBtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout2)

        backBtn = findViewById<ImageButton>(R.id.backbtn)

        backBtn.setOnClickListener {
            val intent = Intent(this@workout2, s2::class.java)
            startActivity(intent)
        }
    }
}