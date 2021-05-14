package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.user_email)
        val pass = findViewById<TextInputEditText>(R.id.user_password)
        val loginInButton = findViewById<MaterialButton>(R.id.login_button)

        loginInButton.setOnClickListener() {

            if (email.toString().isNullOrEmpty() || pass.toString().isNullOrEmpty()) {
                Toast.makeText(this, "Email or Password is not provided", Toast.LENGTH_LONG).show()
            } else {
                if (email.toString() == "name@admin.com" && pass.toString() == "admin") {
                    val intent = Intent(this, ViewActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Wrong email or password", Toast.LENGTH_LONG).show()
                }
            }
        }
        }
    }
