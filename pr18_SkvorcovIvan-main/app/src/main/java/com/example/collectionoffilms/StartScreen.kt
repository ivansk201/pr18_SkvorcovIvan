package com.example.collectionoffilms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class StartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)
                Handler().postDelayed({
                    val intent = Intent(this, ZapuskActivity::class.java)
                    startActivity(intent)
                    finish()
                }, 5000)
            }
        }


