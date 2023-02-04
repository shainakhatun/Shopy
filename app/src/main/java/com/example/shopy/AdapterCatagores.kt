package com.example.shopy


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AdapterCatagores(private var list1:List<DataCatageroes>): RecyclerView.Adapter<AdapterCatagores.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.rv2_item,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        var item2Scrooll=list1[position]
        holder.img.setImageResource(item2Scrooll.imgs)
        holder.txt.text=item2Scrooll.textCat2
        holder.img2.setImageResource(item2Scrooll.imgs2)
        holder.txt2.text=item2Scrooll.textCat
    }

    override fun getItemCount(): Int {
        return list1.size
    }

//    fun filterList(): List<DataCatageroes> {
//        list1= filterList()
//        notifyDataSetChanged()
//
//    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var img: ImageView =itemView.findViewById(R.id.img1_id)
        var txt: TextView =itemView.findViewById(R.id.txt1_id)
        var img2: ImageView =itemView.findViewById(R.id.img2_id)
        var txt2: TextView =itemView.findViewById(R.id.txt2_id)
    }
}
