package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager

class lookiesWeek4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lookies_week4)

        val btn1 : Button = findViewById(R.id.gofra1)
        val btn2 : Button = findViewById(R.id.gofra2)
        val btn3 : Button = findViewById(R.id.gofra3)
        val btn4 : Button = findViewById(R.id.gofra4)

        btn1.setOnClickListener {
            val fragment:week4Fragment1 = week4Fragment1()
            val fragmentManager :FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
            fragmentTransaction.commit()
        }


        btn2.setOnClickListener {
            val fragment:week4Fragment2 = week4Fragment2()
            val fragmentManager :FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
            fragmentTransaction.commit()
        }


        btn3.setOnClickListener {
            val fragment:week4Fragment3 = week4Fragment3()
            val fragmentManager :FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
            fragmentTransaction.commit()
        }


        btn4.setOnClickListener {
            val fragment:week4Fragment4 = week4Fragment4()
            val fragmentManager :FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment)
            fragmentTransaction.commit()
        }
    }
}