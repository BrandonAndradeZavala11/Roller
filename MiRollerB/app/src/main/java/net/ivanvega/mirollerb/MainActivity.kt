package net.ivanvega.mirollerb

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var dado : ImageView
    lateinit var dado2: ImageView
    lateinit var boton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_roller)

        boton = findViewById(R.id.btnClick)
        dado = findViewById(R.id.dado)
        dado2 = findViewById(R.id.dado2)
        boton.setOnClickListener {
            Toast.makeText(applicationContext,
                "Boton presionado", Toast.LENGTH_LONG ).show()
            dado.setImageDrawable(getRandomDiceImage())
            dado2.setImageDrawable(getRandomDiceImage())

        }
    }

    private fun getRandomDiceImage() : Drawable {
        var lado : Drawable
        val aleato = (1..6).random()
        when(aleato) {
            1 -> {
                lado = getDrawable(R.drawable.dice_1)!!
            }
            2 -> {
                lado = getDrawable(R.drawable.dice_2)!!
            }
            3 -> {
                lado = getDrawable(R.drawable.dice_3)!!
            }
            4 -> {
                lado = getDrawable(R.drawable.dice_4)!!
            }
            5 -> {
                lado = getDrawable(R.drawable.dice_5)!!
            }
            6 -> {
                lado = getDrawable(R.drawable.dice_6)!!
            }
            else -> {
                lado= getDrawable(R.drawable.empty_dice)!!
            }
        }
        return lado
    }

    fun diceRoller(par: Int = 0): Int{
        return (1..6).random()
    }

}