package com.example.collectionoffilms

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.collectionoffilms.filmdirect.*

class CollectionOfFilms2 : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collection_of_films2)

        sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE)

        val lastFilmId = sharedPreferences.getInt("last_film_id", 0)
        if (lastFilmId != 0) {
            val imageView: ImageView = findViewById(R.id.nuller)
            when (lastFilmId) {
                1 -> imageView.setImageResource(R.drawable.backvutures)
                2 -> imageView.setImageResource(R.drawable.intestelasr)
                3 -> imageView.setImageResource(R.drawable.grinmill)
                4 -> imageView.setImageResource(R.drawable.vlastelinconesc)
                5 -> imageView.setImageResource(R.drawable.kriminalctivo)
                6 -> imageView.setImageResource(R.drawable.forestgamp)
                7 -> imageView.setImageResource(R.drawable.pobegshaushenko)
                8 -> imageView.setImageResource(R.drawable.boyclub)
                9 -> imageView.setImageResource(R.drawable.spisokshendr)
                10 -> imageView.setImageResource(R.drawable.tainacoco)
            }
            imageView.visibility = View.VISIBLE
        }
    }

    fun perehodk1film(view: View) {
        val imageclick: ImageView = findViewById(R.id.backinfut)
        val intent = Intent(this, Film1::class.java)
        startActivity(intent)
        // сохраняем идентификатор фильма в SharedPreferences
        val editor = sharedPreferences.edit()
        editor.putInt("last_film_id", 1)
        editor.apply()
        finish()
    }
    fun perehodk2film(view: View) {
        val imageclick: ImageView = findViewById(R.id.intestelar)
        val intent = Intent(this, Film2::class.java)
        startActivity(intent)
        // сохраняем идентификатор фильма в SharedPreferences
        val editor = sharedPreferences.edit()
        editor.putInt("last_film_id", 2)
        editor.apply()
        finish()
    }
    fun perehodk3film(view: View) {
        val imageclick: ImageView = findViewById(R.id.grinmilya)
        val intent = Intent(this, Film3::class.java)
        startActivity(intent)
        // сохраняем идентификатор фильма в SharedPreferences
        val editor = sharedPreferences.edit()
        editor.putInt("last_film_id", 3)
        editor.apply()
        finish()
    }
    fun perehodk4film(view: View) {
        val imageclick: ImageView = findViewById(R.id.vlastickolec)
        val intent = Intent(this, Film4::class.java)
        startActivity(intent)
        // сохраняем идентификатор фильма в SharedPreferences
        val editor = sharedPreferences.edit()
        editor.putInt("last_film_id", 4)
        editor.apply()
        finish()
    }
    fun perehodk5film(view: View) {
        val imageclick: ImageView = findViewById(R.id.krimctivoo)
        val intent = Intent(this, Film5::class.java)
        startActivity(intent)
        // сохраняем идентификатор фильма в SharedPreferences
        val editor = sharedPreferences.edit()
        editor.putInt("last_film_id", 5)
        editor.apply()
        finish()
    }
    fun perehodk6film(view: View) {
        val imageclick: ImageView = findViewById(R.id.forsicgamp)
        val intent = Intent(this, Film6::class.java)
        startActivity(intent)
        // сохраняем идентификатор фильма в SharedPreferences
        val editor = sharedPreferences.edit()
        editor.putInt("last_film_id", 6)
        editor.apply()
        finish()
    }
    fun perehodk7film(view: View) {
        val imageclick: ImageView = findViewById(R.id.pobeging)
        val intent = Intent(this, Film7::class.java)
        startActivity(intent)
        // сохраняем идентификатор фильма в SharedPreferences
        val editor = sharedPreferences.edit()
        editor.putInt("last_film_id", 7)
        editor.apply()
        finish()
    }
    fun perehodk8film(view: View) {
        val imageclick: ImageView = findViewById(R.id.boychikclub)
        val intent = Intent(this, Film8::class.java)
        startActivity(intent)
        // сохраняем идентификатор фильма в SharedPreferences
        val editor = sharedPreferences.edit()
        editor.putInt("last_film_id", 8)
        editor.apply()
        finish()
    }
    fun perehodk9film(view: View) {
        val imageclick: ImageView = findViewById(R.id.sposkkshendr)
        val intent = Intent(this, Film9::class.java)
        startActivity(intent)
        // сохраняем идентификатор фильма в SharedPreferences
        val editor = sharedPreferences.edit()
        editor.putInt("last_film_id", 9)
        editor.apply()
        finish()
    }
    fun perehodk10film(view: View) {
        val imageclick: ImageView = findViewById(R.id.tainacicicoco)
        val intent = Intent(this, Film10::class.java)
        startActivity(intent)
        // сохраняем идентификатор фильма в SharedPreferences
        val editor = sharedPreferences.edit()
        editor.putInt("last_film_id", 10)
        editor.apply()
        finish()
    }


}