package com.example.ageinminutes

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.selectDateButton) as Button
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        var ageInMinutes = 0
        button.setOnClickListener{
            DatePickerDialog(this,DatePickerDialog.OnDateSetListener{
                    view, selectedYear, selectedMonth, selectedDayOfMonth ->
                Toast.makeText(this,
                    "The date selected is $selectedDayOfMonth/${selectedMonth+1}/$selectedYear", Toast.LENGTH_LONG).show()
                findViewById<TextView>(R.id.tvSelectedDate).text = "$selectedDayOfMonth/${selectedMonth+1}/$selectedYear"
                ageInMinutes = (year - selectedYear ) * 12 * 30 * 24 * 60
                findViewById<TextView>(R.id.tvAgeInMinutes).text = "$ageInMinutes"
            }
                ,year
                ,month
                ,day).show()
        }

    }
}