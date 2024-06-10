package com.example.workouttracker

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ListView
import android.widget.TextView

class home : AppCompatActivity() {

    //declaration
    lateinit var backbutton : ImageButton
    private lateinit var textView: TextView
    private lateinit var editButton: Button
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //initializatiom
        backbutton = findViewById<ImageButton>(R.id.backbtn)
        textView = findViewById(R.id.emptytxt)
        editButton = findViewById(R.id.editbutton)

        //showing the stored strings
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        val text = sharedPreferences.getString("text", "")

        textView.text = text

        //back to dashboard
        backbutton.setOnClickListener {
            val intent = Intent(this@home, s2::class.java)
            startActivity(intent)
        }

        //to the editor
        editButton.setOnClickListener {
            val intent = Intent(this@home, edit::class.java)
            startActivity(intent)
        }
    }
}