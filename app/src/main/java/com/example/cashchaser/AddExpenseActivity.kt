package com.example.cashchaser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AddExpenseActivity : AppCompatActivity() {

    lateinit var itemInput: EditText
    lateinit var priceInput: EditText
    lateinit var dateInput: EditText
    lateinit var addButton: Button
    lateinit var summaryButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_expense)

        itemInput = findViewById(R.id.itemInput)
        priceInput = findViewById(R.id.priceInput)
        dateInput = findViewById(R.id.dateInput)
        addButton = findViewById(R.id.addButton)
        summaryButton = findViewById(R.id.summaryButton)

        addButton.setOnClickListener {
            val price = priceInput.text.toString().toIntOrNull()

            if (price != null) {
                MainActivity.totalExpenses += price
                Toast.makeText(this, "Expense Added! Total: ${MainActivity.totalExpenses}", Toast.LENGTH_SHORT).show()

                // Reset input fields
                itemInput.text.clear()
                priceInput.text.clear()
                dateInput.text.clear()
            } else {
                Toast.makeText(this, "Please enter a valid price", Toast.LENGTH_SHORT).show()
            }
        }

        summaryButton.setOnClickListener {
            val intent = Intent(this, SummaryActivity::class.java)
            startActivity(intent)
        }
    }
}
