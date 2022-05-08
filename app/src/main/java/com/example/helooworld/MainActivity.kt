package com.example.helooworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.TtsSpan
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi:Button
    lateinit var btnSendMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi = findViewById(R.id.btnBmi)
        btnBmi.setOnClickListener {
            var intent = Intent(this, BMICalculator::class.java)
            startActivity(intent)
        }
            btnSendMoney = findViewById(R.id.btnSendMoney)
            btnSendMoney.setOnClickListener {
                var intent=Intent(this,SendMoney::class.java)
                startActivity(intent)

        }
    }
}