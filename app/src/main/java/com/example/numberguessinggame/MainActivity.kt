package com.example.numberguessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random = (1..100).random()
        var counter = 100;

        guessButton.setOnClickListener {
            val guess = InputEditTextSayi.text.toString().toInt()

            if (guess == random) {
                infoView.text = "Congrats!"


                if(counter > 50 ) {
                    scoreView.text = "Score: "+ counter.toString() + " :)"
                } else {
                    scoreView.text = "Score: "+ counter.toString() + " :("
                }

                guessButton.isEnabled = false
            }
            else {
                counter --;
                if (guess < random){
                    infoView.text = "Try a larger number!"
                    scoreView.text = "Score: "+ counter.toString()
                }
                else {
                    infoView.text = "Try a smaller number!"
                    scoreView.text = "Score: "+ counter.toString()
                }
            }
        }

    }
}