package com.example.testingapp3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        /*Declaration of Variables*/
        val txtEnterName = findViewById<EditText>(R.id.txtEnterName)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val lblNameDisplay = findViewById<TextView>(R.id.lblNameDisplay)

        /*Submit Button functionality*/
        btnSubmit.setOnClickListener {

            val name = txtEnterName.text.toString()

            /*If statement for error handling, if input is present the name is displayed,
            * if input is not present the code will display alternative message*/
            if (name.isNotEmpty()) {
                lblNameDisplay.text = getString(R.string.lblDisplay, name)
            }
            else {
                lblNameDisplay.text = getString(R.string.lblEmpty)
            }
        }

        /*Clear Button functionality*/
        btnClear.setOnClickListener {
            txtEnterName.text.clear()
            lblNameDisplay.text = ""
        }
        }
    }
