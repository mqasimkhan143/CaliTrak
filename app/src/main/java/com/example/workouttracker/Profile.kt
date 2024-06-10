package com.example.workouttracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Profile : AppCompatActivity() {

    //declaration
    lateinit var backBtn : ImageButton
    lateinit var logoutBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        //initialization
        backBtn = findViewById<ImageButton>(R.id.backbutton)
        logoutBtn = findViewById<Button>(R.id.lougoutbtn)

        //functions for going back to dashboard adn logout
        backBtn.setOnClickListener{
            val intent = Intent(this@Profile, s2::class.java)
            startActivity(intent)
        }

        //logout
        logoutBtn.setOnClickListener{
            val intent = Intent(this@Profile, MainActivity::class.java)
            startActivity(intent)
        }
    }
}