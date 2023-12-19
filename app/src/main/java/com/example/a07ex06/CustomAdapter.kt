package com.example.a07ex06

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var arr: Array<String>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val textView = view.findViewById<TextView>(R.id.rv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.text_row_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
        holder.textView.text = arr[position]
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return arr.size
    }

}
