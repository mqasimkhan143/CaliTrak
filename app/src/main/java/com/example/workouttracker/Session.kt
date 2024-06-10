package com.example.workouttracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Session : AppCompatActivity() {

    //toast msg
    lateinit var applyBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_session)

        applyBtn = findViewById<Button>(R.id.applybutton)

        applyBtn.setOnClickListener{

            Toast.makeText(this, "APPLIED!", Toast.LENGTH_LONG).show()

            val intent = Intent(this@Session, s2::class.java)
            startActivity(intent)
        }
    }
}