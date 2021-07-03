package com.example.android_views_remidosol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var shopWomenButton: Button
    lateinit var shopMenButton: Button

    lateinit var loginTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        addListeners()
    }

    private fun initViews() {
        shopWomenButton = findViewById(R.id.shopWomenButton)
        shopMenButton = findViewById(R.id.shopMenButton)
        loginTextView = findViewById(R.id.login)
    }

    private fun addListeners() {
        shopWomenButton.setOnClickListener {
            Toast.makeText(baseContext, "Shop Women Button", Toast.LENGTH_SHORT).show()
            navigateToDetail("Shop women")
        }
        shopMenButton.setOnClickListener {
            Toast.makeText(baseContext, "Shop Men Button", Toast.LENGTH_SHORT).show()
            navigateToDetail("Shop men")
        }
        loginTextView.setOnClickListener {
            Toast.makeText(baseContext, "Login TextView", Toast.LENGTH_SHORT).show()
        }
    }

    private fun navigateToDetail(buttonName: String) {
        val intentShopping = Intent(this, ShoppingActivity::class.java)
        intentShopping.putExtra(BUTTON_NAME, buttonName)
        startActivity(intentShopping)
    }

    companion object {
        const val BUTTON_NAME = "com.example.android_views_remidosol.BUTTON_NAME"
    }
}