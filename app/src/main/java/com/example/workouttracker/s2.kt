package com.example.workouttracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.WindowManager
import android.widget.Adapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.PopupWindow
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStateManagerControl
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class s2 : AppCompatActivity() {

    //declaration
    private lateinit var showInstruct : ImageButton
    lateinit var profBtn : ImageButton
    lateinit var sessionBtn : ImageButton
    lateinit var workoutBtn : ImageButton
    lateinit var homeBtn : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s2)

        //initialization
        val infoBtn = findViewById<ImageButton>(R.id.infobutton)
        profBtn = findViewById<ImageButton>(R.id.profilebutton)
        sessionBtn = findViewById<ImageButton>(R.id.sessionbutton)
        workoutBtn = findViewById<ImageButton>(R.id.workoutbutton)
        homeBtn = findViewById<ImageButton>(R.id.homebutton)

        //popup instruct
        infoBtn.setOnClickListener {
            val inflater = layoutInflater
            val view = inflater.inflate(R.layout.activity_popup, null)

            val window = PopupWindow(view, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT, true)

            window.showAtLocation(view, Gravity.CENTER, 0, 0)
        }

        //functions for activity movement, Profile
        profBtn.setOnClickListener {
            val intent = Intent(this@s2, Profile::class.java)
            startActivity(intent)
        }

        //Session application
        sessionBtn.setOnClickListener {
            val intent = Intent(this@s2, Session::class.java)
            startActivity(intent)
        }

        //excercises
        workoutBtn.setOnClickListener {
            val intent = Intent(this@s2, workout2::class.java)
            startActivity(intent)
        }

        //Home or tracker
        homeBtn.setOnClickListener {
            val intent = Intent(this@s2, home::class.java)
            startActivity(intent)
        }
    }
}

