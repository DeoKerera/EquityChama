package com.vsla.equitychama

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vsla.equitychama.R.id.enterBtn

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        val dashBtn=findViewById<Button>(R.id.enterBtn)
        dashBtn.setOnClickListener {
            val intent2 = Intent(this@LoginActivity, MemberDashboardActivity::class.java)
            startActivity(intent2)
        }
    }
}