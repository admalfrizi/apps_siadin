package com.example.apps_siadin.screens

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apps_siadin.R
import com.example.apps_siadin.adapters.PerkuliahanAdapter
import com.example.apps_siadin.adapters.daynowAdapter
import com.example.apps_siadin.models.HariKini
import com.example.apps_siadin.models.PerkuliahanData

class DashboardScreen : Fragment() {

    private val listDay = ArrayList<HariKini>()
    val perkuliahanList : ArrayList<PerkuliahanData> = ArrayList<PerkuliahanData>()
    var perkuliahanView: GridView? = null
    private lateinit var dayAdapter: daynowAdapter
    var prklhnlistAdapter: PerkuliahanAdapter? = null

    private lateinit var nm : TextView
    private lateinit var nim : TextView
    private lateinit var eml : TextView

    private lateinit var username : String
    private lateinit var nmr_induk_mhs : String
    private lateinit var alamat_email_mhs : String

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val component: View = inflater.inflate(R.layout.dashboard_screen,container,false)

        val recyclerView : RecyclerView = component.findViewById(R.id.day_now)
        perkuliahanView = component.findViewById(R.id.perklhn_view) as GridView

        init(component)


        dayAdapter = daynowAdapter(listDay)
        val layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = dayAdapter

        prklhnlistAdapter = PerkuliahanAdapter(component.context, perkuliahanList)
        perkuliahanView!!.adapter = prklhnlistAdapter

        perkuliahanView!!.setOnTouchListener { v, event ->
            event.action == MotionEvent.ACTION_MOVE
        }

        hariterkini()
        perkuliahanmenu()


        //username = sessionManager.getString(sessionManager.nama)!!
        //nmr_induk_mhs = sessionManager.getString(sessionManager.nim)!!
        //alamat_email_mhs = sessionManager.getString(sessionManager.email)!!

        return component
    }

    private fun init(component: View) {

        nm = component.findViewById(R.id.txt_nama_mhs)
        nim = component.findViewById(R.id.txt_nim_mhs)
        eml = component.findViewById(R.id.txt_email_mhs)

    }

    private fun perkuliahanmenu() {
        val btn1 = PerkuliahanData()
        btn1.img_prklhn = R.drawable.ic_absensi
        btn1.namemenu = "Absensi"
        btn1.color = Color.parseColor("#4E91A5")
        perkuliahanList.add(btn1)

        val btn2 = PerkuliahanData()
        btn2.img_prklhn = R.drawable.ic_tugas_kuliah
        btn2.namemenu = "Tugas Kuliah"
        btn2.color = Color.parseColor("#C53B76")
        perkuliahanList.add(btn2)

        val btn3 = PerkuliahanData()
        btn3.img_prklhn = R.drawable.ic_daftar_nilai
        btn3.namemenu = "Daftar Nilai"
        btn3.color = Color.parseColor("#3DAED1")
        perkuliahanList.add(btn3)

        val btn4 = PerkuliahanData()
        btn4.img_prklhn = R.drawable.ic_khs
        btn4.namemenu = "KHS"
        btn4.color = Color.parseColor("#7FCB51")
        perkuliahanList.add(btn4)
    }

    private fun hariterkini() {

        val hari1 = HariKini("Senin, 17 September 2021", Color.parseColor("#55B7A5"))
        listDay.add(hari1)

        val hari2 = HariKini("Selasa, 18 September 2021",Color.parseColor("#285987"))
        listDay.add(hari2)

        val hari3 = HariKini("Rabu, 19 September 2021",Color.parseColor("#713F89"))
        listDay.add(hari3)

        val hari4 = HariKini("Kamis, 20 September 2021",Color.parseColor("#FEC20F"))
        listDay.add(hari4)

    }
}
