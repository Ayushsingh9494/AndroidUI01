package com.example.gradecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Linearlayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_linearlayout)
        val etSub1 = findViewById<EditText>(R.id.etSub1)
        val etSub2 = findViewById<EditText>(R.id.etSub2)
        val etSub3 = findViewById<EditText>(R.id.etSub3)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalculate.setOnClickListener {
            val m1 = etSub1.text.toString().toDouble()
            val m2 = etSub2.text.toString().toDouble()
            val m3 = etSub3.text.toString().toDouble()

            val cgpa = (m1 + m2 + m3) / 3 / 10

            tvResult.text = "CGPA: %.2f".format(cgpa)
        }
    }
}