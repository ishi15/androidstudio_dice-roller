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
        val rollButton: Button = findViewById(R.id.button)   //find button from layout
      //when user clicks on the button something should happen hence the click listener
        rollButton.setOnClickListener {
            rollDice()
        } //roll dice fun will display the random dice number generated
    }

    private fun rollDice() {
       val dice=Dice(6)     //dice is an object of class Dice
        val diceRoll=dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text=diceRoll.toString()
    }
}
class Dice(val numSides: Int){
    fun roll(): Int {
        return (1..numSides).random()
    }
}

