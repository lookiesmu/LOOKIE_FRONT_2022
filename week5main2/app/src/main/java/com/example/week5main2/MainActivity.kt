package com.example.week5main2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.LayoutInflater
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week5main2.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val planList = ArrayList<plan>()

        go_to_dialog.setOnClickListener {
            val dialog = dialogview(this)
            dialog.showDia()

            dialog.setOnClickedListener(object : dialogview.ButtonClickListener {
                override fun onClicked(date: String, detail: String) {
                    planList.add(0, plan(date,detail))
                    val adapter = planAdapter(planList, LayoutInflater.from(this@MainActivity))

                    plan_recycler_view.adapter = adapter
                    plan_recycler_view.layoutManager = LinearLayoutManager(this@MainActivity)
                }
            })
        }
    }
}