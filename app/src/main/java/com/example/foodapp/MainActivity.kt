package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val log:Button = findViewById<Button>(R.id.loginbtn)


        log.setOnClickListener{
            val intentt = Intent(this,login::class.java)
            startActivity(intentt);

        }

        val register :Button=findViewById(R.id.registerbtn)

        register.setOnClickListener{
            val reg=Intent(this,SignUpactivity::class.java)
            startActivity(reg);
        }



    }


  }




