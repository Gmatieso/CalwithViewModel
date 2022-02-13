package com.example.calwithviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var answerTextView: TextView
    private lateinit var calculateButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    // binding the activity layout with main layout using findView by id
        num1EditText = findViewById(R.id.editTextNumberOne)
        num2EditText = findViewById(R.id.editTextNumberTwo)
        answerTextView = findViewById(R.id.textViewAnswer)
        calculateButton = findViewById(R.id.buttonCalculate)
    // setting onClickListener on the calculateButton
        calculateButton.setOnClickListener {
            val num1 = num1EditText.text.toString()
            val num2 = num2EditText.text.toString()

            // validation check if EditText is empty
        if(num1.isEmpty() || num2.isEmpty())
        {
            return@setOnClickListener
        }

        }


    }
    // fun calculate button
    fun addTwoNumbers(num1:Int,num2:Int):Int {
        return num1 + num2
    }
}