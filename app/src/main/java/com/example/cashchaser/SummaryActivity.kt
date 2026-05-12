package com.example.cashchaser

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SummaryActivity : AppCompatActivity() {

    lateinit var summaryText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        summaryText = findViewById(R.id.summaryText)

        val budget = MainActivity.budget
        val totalExpenses = MainActivity.totalExpenses
        val result: String

        if (totalExpenses > budget) {
            result = "You have exceeded your budget by ${totalExpenses - budget}!"
        } else {
            result = "You saved ${budget - totalExpenses} this month!"
        }

        summaryText.text = result
    }
}
