package com.example.firstnativeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val yearBirthET = findViewById<EditText>(R.id.yearOfBirth_EditText)
        val ageTV = findViewById<TextView>(R.id.age_textView)
        val calcButton = findViewById<Button>(R.id.calculate_button)


        calcButton.setOnClickListener {
            val yearOB = yearBirthET.editableText.toString()
            val age = 2023 - yearOB.toInt()
            ageTV.text = age.toString()

        }
    }
}