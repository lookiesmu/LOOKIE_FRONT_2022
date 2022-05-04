package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import kotlinx.android.synthetic.main.activity_internet_opener.*

class InternetOpener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet_opener)

//
//        address_edit_text

        open.setOnClickListener {
            val address = address_edit_text.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }
//
//        address_edit_text.addTextChangedListener()

        address_edit_text.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("edit", "beforeTextChanged : " + p0)
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("edit", "onTextChanged : " + p0)
            }

            override fun afterTextChanged(p0: Editable?) {
                 Log.d("edit", "afterTextChanged : " + p0)
            }
        })
    }


}