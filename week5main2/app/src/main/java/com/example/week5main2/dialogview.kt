package com.example.week5main2

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.dialogview.*

class dialogview(context : Context){
    val dialog =Dialog(context)

    fun showDia(){
        dialog.setContentView(R.layout.dialogview)
        dialog.show()

        val date = dialog.findViewById<EditText>(R.id.date_editText)
        val detail = dialog.findViewById<EditText>(R.id.detail_editText)

        dialog.add_button.setOnClickListener {
            onClickedListener.onClicked(date.text.toString(), detail.text.toString())
            dialog.dismiss()
        }

        dialog.cancel_button.setOnClickListener {
            dialog.dismiss()
        }
    }

    interface ButtonClickListener {
        fun onClicked(date: String, detail: String)
    }

    private lateinit var onClickedListener: ButtonClickListener

    fun setOnClickedListener(listener: ButtonClickListener) {
        onClickedListener = listener
    }
}