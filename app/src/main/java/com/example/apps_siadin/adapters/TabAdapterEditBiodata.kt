package com.example.apps_siadin.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.apps_siadin.tablayoutmenu.editbiodata.MahasiswaScreen
import com.example.apps_siadin.tablayoutmenu.editbiodata.SertifikatScreen
import com.example.apps_siadin.tablayoutmenu.editbiodata.UploadFileScreen

class TabAdapterEditBiodata(var context: Context, fm : FragmentManager, lifecycle: Lifecycle, private var numberOfTabs : Int ) : FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int {
        return numberOfTabs
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {

            0 -> {
                MahasiswaScreen()
            }
            1 -> {
                UploadFileScreen()
            }
            2 -> {
                SertifikatScreen()
            }
            else -> createFragment(position)
        }
    }

}