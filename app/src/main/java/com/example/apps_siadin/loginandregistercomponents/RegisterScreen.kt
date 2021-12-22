package com.example.apps_siadin.loginandregistercomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.apps_siadin.R
import com.example.apps_siadin.models.UserResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class RegisterScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)

        backtologin()

    }

    private fun backtologin() {
        val backbtn = findViewById<TextView>(R.id.lgn_btn)

        backbtn.setOnClickListener {
            onBackPressed()
        }
    }
}