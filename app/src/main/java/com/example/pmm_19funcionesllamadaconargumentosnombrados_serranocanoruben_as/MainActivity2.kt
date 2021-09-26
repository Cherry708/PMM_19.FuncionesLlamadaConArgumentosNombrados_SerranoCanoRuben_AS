package com.example.pmm_19funcionesllamadaconargumentosnombrados_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val etNumber0 = findViewById<EditText>(R.id.etNumber20)
        val etNumber1 = findViewById<EditText>(R.id.etNumber21)
        val tvResult0 = findViewById<TextView>(R.id.tvResult20)

        val btnCalculate = findViewById<Button>(R.id.btnCalculate20)
        btnCalculate.setOnClickListener {
            val number0 = etNumber0.text.toString().toInt()
            val number1 = etNumber1.text.toString().toInt()
            tvResult0.text = multiplication(number0,number1).toString()
        }
    }

    fun multiplication(n:Int, m:Int):Int{
        return n*m
    }
}