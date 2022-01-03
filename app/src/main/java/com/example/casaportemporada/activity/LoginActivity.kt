package com.example.casaportemporada.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.casaportemporada.R

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        configurarClique()
    }

    private fun configurarClique() {
       findViewById<TextView>(R.id.cadastrar).setOnClickListener { view ->
           startActivity(Intent(this, CriarContaActivity::class.java))
       }
    }
}

