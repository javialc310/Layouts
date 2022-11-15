package com.example.tasks06_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Linear2 : AppCompatActivity() {
    private lateinit var botonLinear2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear2)

        botonLinear2=findViewById(R.id.buttonLinear2)

        botonLinear2.setOnClickListener{
            val intent = Intent(this@Linear2, Table1::class.java)

            startActivity(intent)
        }
    }
}