package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUpactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_upactivity)



        val alre:TextView = findViewById(R.id.alredytxt)
        alre.setOnClickListener{
            val all=Intent(this,login::class.java)
            startActivity(all);
        }

        val registration:Button = findViewById(R.id.regbtn)
        registration.setOnClickListener{
            val regg=Intent(this,MainActivity::class.java)

            startActivity(regg);
        }



    }
}