package com.example.shopy

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass ( private val items :ArrayList<Item>):RecyclerView.Adapter<AdapterClass.NewsViewHolder>() {

    class NewsViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        var tranding: TextView = itemView.findViewById(R.id.txtTrending)
        var seeall: TextView = itemView.findViewById(R.id.txtSeeAll)
        var imgView: ImageView = itemView.findViewById(R.id.imgView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        val viewHolder = NewsViewHolder(view)
        return viewHolder
    }
    override fun getItemCount(): Int {
return items.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
var shaina=items[position]
        holder.tranding.text=shaina.text

    }

}

