package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countUp() }

    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)


        if (resultText.text == "Dice Rolled!") {
            resultText.text="1"
        } else {
            var current = resultText.text.toString().toInt()

            if (current < 6) {
                current++
                resultText.text = current.toString()
            }
        }


    }

    private fun rollDice() {
        Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }
}