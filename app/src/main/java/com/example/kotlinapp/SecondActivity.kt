package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //связываем
        var textMessage = findViewById<TextView>(R.id.textViewMessage)

        //получаем информацию из интента создавая переменную
        var i = intent

        //проверяем на нулл и если ок устанавливаем текст
        if (i !== null) textMessage.setText(i.getCharSequenceExtra("Hello!"))
    }
}