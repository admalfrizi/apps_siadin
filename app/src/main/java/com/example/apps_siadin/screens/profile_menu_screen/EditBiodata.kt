package com.example.apps_siadin.screens.profile_menu_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
import com.example.apps_siadin.R
import com.example.apps_siadin.adapters.TabAdapterEditBiodata
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class EditBiodata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_biodata)

        val back_btn = findViewById<ImageView>(R.id.back_btn)
        val tab_edt_bdta = findViewById<TabLayout>(R.id.tab_edt_bdta_btn)
        val view_tab_edt_bdta = findViewById<ViewPager2>(R.id.edt_bdta_view)

        tab_edt_bdta.addTab(tab_edt_bdta.newTab().setText("Mahasiswa"))
        tab_edt_bdta.addTab(tab_edt_bdta.newTab().setText("Upload File"))
        tab_edt_bdta.addTab(tab_edt_bdta.newTab().setText("Sertifikat"))

        tab_edt_bdta.tabRippleColor = null

        tab_edt_bdta.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = TabAdapterEditBiodata(this,supportFragmentManager, lifecycle, tab_edt_bdta.tabCount)
        view_tab_edt_bdta.adapter = adapter


        tab_edt_bdta.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                view_tab_edt_bdta.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })


        back_btn.setOnClickListener {
            onBackPressed()
        }
    }
}