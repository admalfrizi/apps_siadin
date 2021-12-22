package com.example.apps_siadin.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.apps_siadin.tablayoutmenu.document_tab.AbsensiTab
import com.example.apps_siadin.tablayoutmenu.document_tab.CatatanTab
import com.example.apps_siadin.tablayoutmenu.document_tab.RepositoryTab

internal class TabAdapter(var context: Context, fm: FragmentManager, var totalTabs: Int) : FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                AbsensiTab()
            }
            1 -> {
                RepositoryTab()
            }
            2 -> {
                CatatanTab()
            }
            else -> getItem(position)
        }
    }
}