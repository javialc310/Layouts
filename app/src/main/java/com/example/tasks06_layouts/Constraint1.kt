package com.example.tasks06_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Constraint1 : AppCompatActivity() {
    private lateinit var buttonConstraint1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint1)

        buttonConstraint1=findViewById(R.id.buttonConstraint1)
        buttonConstraint1.setOnClickListener {
            val intent= Intent(this@Constraint1, Constraint2::class.java)

            startActivity(intent)
        }
    }
}