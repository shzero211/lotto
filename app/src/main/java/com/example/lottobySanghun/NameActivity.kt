package com.example.lottobySanghun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_name.*

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)


        goButton.setOnClickListener {
            startActivity(Intent(this,ResultActivity::class.java))

        }
        backButton.setOnClickListener{
            finish()
        }
    }
}