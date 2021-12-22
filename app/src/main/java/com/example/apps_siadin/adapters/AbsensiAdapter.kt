package com.example.apps_siadin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.apps_siadin.R
import com.example.apps_siadin.models.AbsensiData

class AbsensiAdapter( val listDataAbsensi: ArrayList<AbsensiData>) : RecyclerView.Adapter<AbsensiAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val txtKlmpkMtkl : TextView
        val txtMtkl : TextView
        val txtNmDosen : TextView
        val txtNidDosen : TextView
        val txtJnsMtkl : TextView
        val txtSks : TextView

        init {
            txtKlmpkMtkl = itemView.findViewById(R.id.klmpk_vl)
            txtMtkl = itemView.findViewById(R.id.matkul_vl)
            txtNmDosen = itemView.findViewById(R.id.nm_vl)
            txtNidDosen = itemView.findViewById(R.id.nid_vl)
            txtJnsMtkl = itemView.findViewById(R.id.jns_vl)
            txtSks = itemView.findViewById(R.id.sks_vl)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.abs_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val absensi = listDataAbsensi[position]

        holder.txtKlmpkMtkl.text = absensi.getKlmpkBjr()
        holder.txtMtkl.text = absensi.getNmMtkl()
        holder.txtNmDosen.text = absensi.getNmDsn()
        holder.txtNidDosen.text = absensi.getNidDns()
        holder.txtJnsMtkl.text = absensi.getJnsMtkl()
        holder.txtSks.text = absensi.getSks().toString()

    }

    override fun getItemCount(): Int {
        return listDataAbsensi.size
    }

}