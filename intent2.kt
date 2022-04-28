package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        val result : Button = findViewById(R.id.result)

        result.setOnClickListener {
//            val num1:Int = intent.getIntExtra("num1", 0)
//            val num2:Int = intent.getIntExtra("num2", 0)
//
//            Log.d("number", ""+num1)
//            Log.d("number", ""+num2)
//
//            val sum = num1+num2
//
//            val resultIntent = Intent()
//            resultIntent.putExtra("result", sum)
//            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}