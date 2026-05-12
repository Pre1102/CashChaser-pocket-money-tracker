package com.example.cashchaser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var budgetInput: EditText
    lateinit var saveButton: Button

    companion object {
        var budget = 0
        var totalExpenses = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        budgetInput = findViewById(R.id.budgetInput)
        saveButton = findViewById(R.id.saveButton)

        saveButton.setOnClickListener {
            val budgetText = budgetInput.text.toString()
            if (budgetText.isNotEmpty()) {
                budget = budgetText.toInt()
                totalExpenses = 0  // Resetting total expenses when a new budget is set
                Toast.makeText(this, "Budget Set: $budget", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, AddExpenseActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please enter a valid budget", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
