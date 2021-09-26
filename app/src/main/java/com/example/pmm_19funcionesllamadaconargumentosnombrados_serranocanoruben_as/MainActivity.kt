package com.example.pmm_19funcionesllamadaconargumentosnombrados_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResult = findViewById<TextView>(R.id.tvResult10)
        val etWorkerName = findViewById<EditText>(R.id.etWorkerName)
        val etHourlyWage = findViewById<EditText>(R.id.etHourlyWage)
        val etTimeWorked = findViewById<EditText>(R.id.etTimeWorked)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate10)

        btnCalculate.setOnClickListener {
            val workerName = etWorkerName.text.toString()
            val hourlyWage = etHourlyWage.text.toString().toDouble()
            val timeWorked = etTimeWorked.text.toString().toInt()

            tvResult.text = getPayRoll(workerName, hourlyWage, timeWorked)
        }



    }

    fun getPayRoll(workerName: String, hourlyWage:Double, timeWorked:Int): String{
        val wage = hourlyWage*timeWorked
        return "$workerName has worked $timeWorked hours at an hourly wage of $hourlyWage, the wage is: $wage"
    }
}