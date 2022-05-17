package com.example.week5main2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class planAdapter(
    val items: ArrayList<plan> = ArrayList(),
    val inflater: LayoutInflater
):RecyclerView.Adapter<planAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val date : TextView
        val detail : TextView

        init {
            date = itemView.findViewById(R.id.date)
            detail = itemView.findViewById(R.id.detail)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.planview,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item:plan = items.get(position)
        holder.date.setText(items.get(position).date)
        holder.detail.setText(items.get(position).detail)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}