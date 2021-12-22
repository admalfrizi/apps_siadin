package com.example.apps_siadin.adapters

import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.apps_siadin.R
import com.example.apps_siadin.models.HariKini

class daynowAdapter (val dataset: ArrayList<HariKini>): RecyclerView.Adapter<daynowAdapter.ViewHolder>() {

    class ViewHolder(itemView: View ): RecyclerView.ViewHolder(itemView) {
        val txtDay : TextView
        val colDay : CardView

        init {
            txtDay = itemView.findViewById(R.id.day)
            colDay = itemView.findViewById(R.id.day_btn)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.day_view_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hariKini = dataset[position]
        holder.txtDay.text = hariKini.getTanggal()

        val color = hariKini.getColorDay()
        holder.colDay.setCardBackgroundColor(color!!)
    }

    override fun getItemCount() : Int {
        return dataset.size
    }
}