package com.pardeep.recycleradapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    // find view in view group
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var textView = itemView.findViewById<TextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_data,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.setText(position.toString())
    }

}
