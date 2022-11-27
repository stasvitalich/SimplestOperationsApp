package com.example.mysecondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.mysecondapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() { // Создаём main activity.

    lateinit var bindingClass: ActivityMainBinding
    val a = 324
    val b = 34


    override fun onCreate(savedInstanceState: Bundle?) { // Создаём первый цикл жизни Activity - onCreate/
        super.onCreate(savedInstanceState) // Это обязательная строка для onCreate
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.button1.setOnClickListener {
            val result = a + b
            bindingClass.result.text = "Результат сложения равен: $result"
        }

        bindingClass.button2.setOnClickListener {
            val result = a - b
            bindingClass.result.text = "Результат вычитания равен: $result"
        }

        bindingClass.button3.setOnClickListener {
            val result = a * b
            bindingClass.result.text = "Результат умножения равен: $result"
        }

        bindingClass.button4.setOnClickListener {
            bindingClass.result.text = "$a и $b"
        }

    }
}

