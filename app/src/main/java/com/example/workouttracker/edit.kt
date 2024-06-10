package com.example.workouttracker

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class edit : AppCompatActivity() {

    //Declaration
    private lateinit var editTxt: EditText
    private lateinit var saveButton : Button
    private lateinit var clearButton : Button
    private lateinit var savenexitButton : Button
    private lateinit var sharedPreferences : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        //Initializatiom
        editTxt = findViewById(R.id.editText)
        saveButton = findViewById(R.id.savebutton)
        clearButton = findViewById(R.id.clearbutton)
        savenexitButton = findViewById(R.id.savenexitbutton)

        //sharedpreference
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        //function for adding strings to sharedpreference
        saveButton.setOnClickListener {
            val inputText = editTxt.text.toString()
            val editor = sharedPreferences.edit()
            editor.putString("text", inputText)
            editor.apply()
        }

        //text clear
        clearButton.setOnClickListener {
            editTxt.text.clear()
        }

        //back to home page
        savenexitButton.setOnClickListener {
            val intent = Intent(this@edit, home::class.java)
            startActivity(intent)
        }
    }
}