package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val signinn:Button = findViewById(R.id.signinbtn)

        signinn.setOnClickListener{
            val sig=Intent(this,MainActivity::class.java)
            startActivity(sig);
        }
        val clickme:TextView = findViewById(R.id.doesntregtxt)
        clickme.setOnClickListener{
            val reg=Intent(this,SignUpactivity::class.java)
            startActivity(reg);
            // commit changes 
        }
    }
}