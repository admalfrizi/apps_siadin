package com.example.apps_siadin.loginandregistercomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.widget.AppCompatButton
import com.example.apps_siadin.BottomNav
import com.example.apps_siadin.R
import com.example.apps_siadin.models.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)


        val fp_button = findViewById<TextView>(R.id.fp_button)
        val login_btn = findViewById<AppCompatButton>(R.id.login_btn)
        val register = findViewById<TextView>(R.id.rgstr_btn)
        val nim = findViewById<EditText>(R.id.nim_edittext)
        val passwd = findViewById<EditText>(R.id.passwd_edittext)


        fp_button.setOnClickListener {
            val intent = Intent(this, ForgotPasswordScreen::class.java)
            startActivity(intent)
        }

        login_btn.setOnClickListener {
            val intent = Intent(this@LoginScreen, BottomNav::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(
                this@LoginScreen,
                "Selamat Datang ",
                Toast.LENGTH_SHORT
            ).show()
        }

        register.setOnClickListener {
            val intent = Intent(this, RegisterScreen::class.java)
            startActivity(intent)
        }

    }


}