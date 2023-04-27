package com.example.collectionoffilms

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import org.json.JSONObject

class ZapuskActivity : AppCompatActivity() {

    private lateinit var layout: ListView
    private lateinit var addAccountButton: Button
    private lateinit var accountList: MutableList<String>
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zapusk)

        layout = findViewById(R.id.accountListView)
        addAccountButton = findViewById(R.id.addAccountButton)
        accountList = mutableListOf()
        sharedPreferences = getSharedPreferences("my_preferences", Context.MODE_PRIVATE)

        addAccountButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, ADD_ACCOUNT_REQUEST_CODE)
        }

        loadAccounts()

        layout.setOnItemClickListener { _, _, position, _ ->
            val selectedAccount = accountList[position]
            val intent = Intent(this, CollectionOfFilms2::class.java)
            intent.putExtra("accountName", selectedAccount)
            startActivity(intent)
        }
    }

    private fun loadAccounts() {
        val jsonString = sharedPreferences.getString("user_info", null)
        if (jsonString != null) {
            val jsonObject = JSONObject(jsonString)
            val accountName = jsonObject.getString("username")
            accountList.add(accountName)
        }

        adapter = ArrayAdapter(this, R.layout.raw, accountList)
        layout.adapter = adapter
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == ADD_ACCOUNT_REQUEST_CODE && resultCode == RESULT_OK) {
            loadAccounts()
        }
    }

    companion object {
        private const val ADD_ACCOUNT_REQUEST_CODE = 1
    }
}

