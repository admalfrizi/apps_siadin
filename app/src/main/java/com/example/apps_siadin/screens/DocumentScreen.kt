package com.example.apps_siadin.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.apps_siadin.R
import com.example.apps_siadin.adapters.TabAdapter
import com.google.android.material.tabs.TabLayout

class DocumentScreen : Fragment() {
    private lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val components : View = inflater.inflate(R.layout.activity_document_screen, container, false)

        tabLayout = components.findViewById(R.id.tab_btn)
        viewPager = components.findViewById(R.id.doc_view_mn)


        tabLayout.addTab(tabLayout.newTab().setText("Absensi"))
        tabLayout.addTab(tabLayout.newTab().setText("Repository"))
        tabLayout.addTab(tabLayout.newTab().setText("Catatan"))

        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = TabAdapter(components.context, childFragmentManager, tabLayout.tabCount)

        tabLayout.tabRippleColor = null

        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })

        return components
    }

}