package com.example.tasks06_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
   private lateinit var botonLinear1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botonLinear1=findViewById(R.id.buttonLinear1)

        botonLinear1.setOnClickListener {
            val intent= Intent(this@MainActivity, Linear2::class.java)

            startActivity(intent)
        }
    }
}