package com.example.snackbarassignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val trueButton = findViewById<Button>(R.id.true_button)
        val falseButton = findViewById<Button>(R.id.false_button)
        trueButton.setOnClickListener { _: View ->
            Snackbar.make(trueButton, "correct", Snackbar.LENGTH_LONG).show()

        }

        falseButton.setOnClickListener {
            Snackbar.make(falseButton, "incorrect", Snackbar.LENGTH_LONG).show()
        }
    }
}