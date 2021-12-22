package com.example.apps_siadin.tablayoutmenu.document_tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apps_siadin.R
import com.example.apps_siadin.adapters.AbsensiAdapter
import com.example.apps_siadin.models.AbsensiData

class AbsensiTab : Fragment() {

    private val listAbsensi = ArrayList<AbsensiData>()
    private lateinit var absensiAdapter : AbsensiAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val components : View = inflater.inflate(R.layout.absensi_tab, container, false)

        val recyclerView : RecyclerView = components.findViewById(R.id.lst_absensi)

        absensiAdapter = AbsensiAdapter(listAbsensi)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = absensiAdapter

        absensi()

        return components
    }

    private fun absensi() {
        val abs1 = AbsensiData("A11.4304","STRUKTUR DATA","FERI AGUSTINA, M.Kom", "A11.54306","Teori/Praktek",4)
        listAbsensi.add(abs1)

        val abs2 = AbsensiData("A11.4307","PEMROGRAMAN BERBASIS WEB","SUPRAYOGI, M.Kom", "A11.54314","Teori",2)
        listAbsensi.add(abs2)

        val abs3 = AbsensiData("A11.4306","PEMROGRAMAN PERANGKAT BERGERAK","CAHAYA JATMOKO, M.Kom", "A11.54314","Teori",2)
        listAbsensi.add(abs3)

    }

}