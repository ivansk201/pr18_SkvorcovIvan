package com.example.collectionoffilms

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

import org.json.JSONObject

class MainActivity2 : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val avatarOptions = arrayOf(
            resources.getDrawable(R.drawable.bear),
            resources.getDrawable(R.drawable.woman1),
            resources.getDrawable(R.drawable.gamer),
            resources.getDrawable(R.drawable.woman2),
            resources.getDrawable(R.drawable.profile),
            resources.getDrawable(R.drawable.user),
            resources.getDrawable(R.drawable.man),
            resources.getDrawable(R.drawable.woman)
        )

        val avatarImageView: ImageView = findViewById(R.id.avatar_imageview)
        avatarImageView.setOnClickListener {
            val selectedAvatar = avatarOptions.random()
            avatarImageView.setImageDrawable(selectedAvatar)
            Toast.makeText(this, "Выбран аватар", Toast.LENGTH_SHORT).show()
        }

        sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()

        usernameEditText = findViewById(R.id.username_edittext)
        passwordEditText = findViewById(R.id.password_edittext)
        loginButton = findViewById(R.id.login_button6)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Введите имя пользователя и пароль", Toast.LENGTH_SHORT).show()
            } else {
                val jsonObject = JSONObject()
                jsonObject.put("username", username)
                jsonObject.put("password", password)
                val jsonString = jsonObject.toString()
                editor.putString("user_info", jsonString)
                editor.apply()

                setResult(RESULT_OK)
                finish()
            }
        }
    }
}
