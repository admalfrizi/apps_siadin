package com.example.apps_siadin.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.apps_siadin.R
import com.example.apps_siadin.models.PerkuliahanData

class PerkuliahanAdapter(var context: Context, private var listPerkuliahan: ArrayList<PerkuliahanData>): BaseAdapter() {


    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = layoutInflater.inflate(R.layout.perkuliahan_btn, null)

        val img = view.findViewById<ImageView>(R.id.ic_prklhn)
        val namebtn = view.findViewById<TextView>(R.id.txt_prklhn) as TextView
        val card = view.findViewById<CardView>(R.id.card_perklhan)

        val setIcon = listPerkuliahan.get(position).img_prklhn
        val setColor = listPerkuliahan.get(position).color

        img.setImageResource(setIcon!!)
        namebtn.text = listPerkuliahan.get(position).namemenu
        card.setCardBackgroundColor(setColor!!)

        return view
    }

    override fun getItem(position: Int): Any {
        return listPerkuliahan.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listPerkuliahan.size
    }




}