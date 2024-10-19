package com.vsla.equitychama

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val loginbtn=findViewById<Button>(R.id.LoginBtn)
        loginbtn.setOnClickListener {
            val intent1 = Intent(this@HomeActivity, LoginActivity::class.java)
            startActivity(intent1)
        }
    }
}