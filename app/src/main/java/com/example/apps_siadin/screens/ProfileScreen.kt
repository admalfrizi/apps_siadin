package com.example.apps_siadin.screens

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.apps_siadin.*
import com.example.apps_siadin.loginandregistercomponents.LoginScreen
import com.example.apps_siadin.screens.profile_menu_screen.EditBiodata

class ProfileScreen : Fragment() {

    lateinit var logout : AppCompatButton
    private lateinit var tvnama : TextView
    private lateinit var tvnim : TextView
    private lateinit var tvemil : TextView
    private lateinit var biodata: AppCompatButton

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val components: View = inflater.inflate(R.layout.activity_profile_screen, container, false)

        logout = components.findViewById(R.id.logout_btn)
        biodata = components.findViewById(R.id.edt_bdta)

        init(components)


        logout.setOnClickListener {
            val intent = Intent(requireActivity(), LoginScreen::class.java)
            startActivity(intent)
        }

        biodata.setOnClickListener {
            val intent = Intent(requireActivity(), EditBiodata::class.java)
            startActivity(intent)
        }

        return components
    }

    private fun init(components: View) {

        logout = components.findViewById(R.id.logout_btn)
        tvnama = components.findViewById(R.id.tv_nama_mhs)
        tvnim = components.findViewById(R.id.tv_nim_mhs)
        tvemil = components.findViewById(R.id.tv_email_mhs)


    }

}