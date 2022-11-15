package com.example.tasks06_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Table2 : AppCompatActivity() {
    private lateinit var buttonTable2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table2)

        buttonTable2=findViewById(R.id.buttonTable2)
        buttonTable2.setOnClickListener {
            val intent=Intent(this@Table2, Constraint1::class.java)

            startActivity(intent)
        }
    }
}