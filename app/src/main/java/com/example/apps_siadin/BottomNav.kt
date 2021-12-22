package com.example.apps_siadin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.apps_siadin.loginandregistercomponents.LoginScreen
import com.example.apps_siadin.screens.*

import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNav : AppCompatActivity() {

    private lateinit var bottom_Nav : BottomNavigationView

    private var statusLogin = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_nav)


        bottom_Nav = findViewById(R.id.bottomNav)

        bottom_Nav.itemRippleColor = null

        bottom_Nav.menu.getItem(0).isCheckable = true

        setFragment(DashboardScreen())

        bottom_Nav.setOnItemSelectedListener { menu ->

            when (menu.itemId) {

                R.id.dashboard -> {
                    setFragment(DashboardScreen())
                    true
                }

                R.id.document -> {
                    setFragment(DocumentScreen())
                    true
                }
                R.id.calendar -> {
                    setFragment(CalendarScreen())
                    true
                }
                R.id.profile -> {
                    setFragment(ProfileScreen())
                    true
                }

                else -> false
            }
        }

    }
    private fun setFragment(fr : Fragment){
        val frag = supportFragmentManager.beginTransaction()
        frag.replace(R.id.screen_view,fr)
        frag.commit()
    }
}