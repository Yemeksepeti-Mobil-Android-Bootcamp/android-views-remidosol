package com.example.android_views_remidosol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.google.android.material.textfield.TextInputLayout

class ShoppingActivity : AppCompatActivity() {

    val TAG = "ShoppingActivity"

    lateinit var backArrowButton: ImageView

    lateinit var headerTextView: TextView
    lateinit var postHeaderTextView: TextView
    lateinit var orTextView: TextView
    lateinit var intentTextHandler: TextView
    lateinit var termsOfUse: TextView

    lateinit var fullName: TextInputLayout
    lateinit var email: TextInputLayout
    lateinit var password: TextInputLayout

    lateinit var signUpButton: Button
    lateinit var connectWithFacebook: Button
    lateinit var connectWithGoogle: Button

    lateinit var headers: LinearLayout
    lateinit var textInputs: LinearLayout
    lateinit var connectButtons: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        this.initViews()
        this.handleIntent(intent)
        this.addListeners()
    }

    private fun initViews() {
        backArrowButton = findViewById(R.id.backArrowButton)
        headerTextView = findViewById(R.id.headerTextView)
        postHeaderTextView = findViewById(R.id.postHeaderTextView)
        orTextView = findViewById(R.id.orTextView)
        intentTextHandler = findViewById(R.id.intentTextHandler)
        termsOfUse = findViewById(R.id.termsOfUse)
        fullName = findViewById(R.id.fullName)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        signUpButton = findViewById(R.id.signUpButton)
        connectWithFacebook = findViewById(R.id.connectWithFacebook)
        connectWithGoogle = findViewById(R.id.connectWithGoogle)
        headers = findViewById(R.id.headers)
        textInputs = findViewById(R.id.textInputs)
        connectButtons = findViewById(R.id.connectButtons)
    }

    private fun handleIntent(intent: Intent?) {
        intent?.let {
            it.getStringExtra(MainActivity.BUTTON_NAME)?.let { buttonName ->
                Log.v(TAG, "Button Name = $buttonName")
                intentTextHandler.text = "$buttonName intent handler"
            }
        }
    }

    private fun addListeners() {
        backArrowButton.setOnClickListener {
            super.onBackPressed()
        }
        signUpButton.setOnClickListener {
            Toast.makeText(baseContext, "Sign Up Button", Toast.LENGTH_SHORT).show()
        }

        connectWithFacebook.setOnClickListener {
            Toast.makeText(baseContext, "Connect with Facebook Button", Toast.LENGTH_SHORT).show()
        }

        connectWithGoogle.setOnClickListener {
            Toast.makeText(baseContext, "Connect with Google Button", Toast.LENGTH_SHORT).show()
        }
    }
}