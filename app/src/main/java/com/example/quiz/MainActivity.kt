package com.example.quiz

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var falseButton: androidx.appcompat.widget.AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)


        trueButton.setOnClickListener {
            val snackbar = Snackbar.make(
                it,
                R.string.correct_toast,
                Snackbar.LENGTH_LONG
            ).setAction("Undo") { view: View ->

                Toast.makeText(
                    this,
                    "Undo",
                    Toast.LENGTH_SHORT
                ).show()
            }
            snackbar.setActionTextColor(Color.MAGENTA)
            val snackbarView = snackbar.view
            snackbarView.setBackgroundColor(Color.BLACK)
            snackbar.show()
        }

        falseButton.setOnClickListener { view: View ->
            Toast.makeText(
                this,
                R.string.incorrect_toast,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}