package com.example.kotlinapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    private var number1: Int = 2
    private var number2: Int = 5

    //можно вызывать результат метода и вставлять его сразу
    private var text: String = "В магазине осталось:  ${getNumber()} яблок"



    //обозначили переменную ХМЛ
    private var helloTextView: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //связали переменную c айди
        helloTextView = findViewById(R.id.helloTextView)


        //устанавливаем текст получая результат из метода и приводим к стринг
//        helloTextView?.setText(getNumber().toString())
        //устанавливаем текст
        helloTextView?.setText(text)


    }


    //метод расчета и возвращаем результат в ИНт
    private fun getNumber():Int {

        return number1 + number2

    }

}