package com.example.collectionoffilms.filmdirect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.collectionoffilms.CollectionOfFilms2
import com.example.collectionoffilms.R

class Film6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film6)
    }
    fun backer(view: View) {val intent = Intent(this, CollectionOfFilms2::class.java)
        startActivity(intent)
        finish()}
}