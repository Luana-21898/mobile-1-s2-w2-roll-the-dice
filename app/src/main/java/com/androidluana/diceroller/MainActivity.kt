package com.androidluana.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //inflating the Layout

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener{ rollDice() }

        Log.i("DEMO", getString(R.string.log_message_1))

    }// /onCreate

    private fun rollDice() {
      //  Toast.makeText(this, getString(R.string.button_clicked1), Toast.LENGTH_SHORT).show()
        Log.i("DEMO", getString(R.string.dice_clicked))

        val resultText: TextView = findViewById(R.id.result_text)

        val randomInt = (1..6).random()

        //resultText.text = getString(R.string.screen_msg_1)

        resultText.text = randomInt.toString()

        val diceImage: ImageView = findViewById(R.id.dice_image)

        //val drawableResource = R.drawable.dice_6

        val drawableResource = when (randomInt) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }


        diceImage.setImageResource(drawableResource)

    }

} // MainActivity