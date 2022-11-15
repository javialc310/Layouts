package com.example.tasks06_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Table1 : AppCompatActivity() {
    private lateinit var buttonTable1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table1)

        buttonTable1=findViewById(R.id.buttonTable1)
        buttonTable1.setOnClickListener {
            val intent=Intent(this@Table1, Table2::class.java)

            startActivity(intent)
        }
    }
}