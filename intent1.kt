package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent1)

        val changeActivity1: Button = findViewById(R.id.change_activity1)
        val changeActivity2: Button = findViewById(R.id.change_activity2)
        val changeActivity3: Button = findViewById(R.id.change_activity3)

        changeActivity1.setOnClickListener {
//            val intent = Intent(this@intent1, intent2::class.java)
//            intent.putExtra("num1",1)
//            intent.putExtra("num2",2)
//            startActivity(intent)
//
//            val intent2 = Intent(this@intent1, intent2::class.java)
//            intent2.apply {
//                this.putExtra("num1",1)
//                this.putExtra("num2",2)
//            }
//            startActivityForResult(intent2,200)
//
//        }
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        Log.d("number",""+requestCode)
//        Log.d("number",""+resultCode)
//        super.onActivityResult(requestCode, resultCode, data)
            val intent = Intent(this@intent1, intent2::class.java)
            startActivity(intent)
        }


        changeActivity2.setOnClickListener{
            val intent = Intent(this@intent1, intent3::class.java)
            startActivity(intent)
        }


        changeActivity3.setOnClickListener{
            val intent = Intent(this@intent1, intent4::class.java)
            startActivity(intent)
        }
    }
}