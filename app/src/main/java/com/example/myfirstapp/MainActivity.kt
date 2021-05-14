package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setupSimpleSpinner()

        signIn()
    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val pass = findViewById<TextInputEditText>(R.id.password_edit_text)
        val signInButton = findViewById<MaterialButton>(R.id.next_button)

        signInButton.setOnClickListener() {

            if (email.toString().isNullOrEmpty() || pass.toString().isNullOrEmpty()){
                Toast.makeText(this, "Email or Password is not provided", Toast.LENGTH_LONG).show()
            } else {
                if(email.toString() == "man@gmail.com" && pass.toString() == "12345") {
                    val intent = Intent(this, ViewActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Wrong email or password", Toast.LENGTH_LONG).show()
                }
            }

        }
    }

    //private fun setupSimpleSpinner() {
     //   val spinner = findViewById<Spinner>(R.id.simple_spinner)
     //   val spinner2: Spinner = findViewById(R.id.simple_spinner)
    //}
}