package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {rollDice()

        }
    }
    private fun rollDice() {
        val randowInt = (1..6).random()
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randowInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

    val txtresultado: TextView = findViewById(R.id.txtresultado)
    val edtnumero: EditText = findViewById(R.id.edtnumero)
    val numero: Int = edtnumero.text.toString().toInt()

    if( randowInt == numero){
        txtresultado.setText("Você ganhou!")
    }else {
        txtresultado.setText("Você perdeu!")
    }
    }
}