package com.example.kotlinapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    private var number1: Int = 0
    private var number2: Double = 0.01

    private var text: String = "abc"

    //обозначили переменную
    private var helloTextView: TextView? = null


    //переменные для счетчика
    private var counter: Int = 0

    private var start: Boolean = false

    //переменная лайаута
    private var cLayout: ConstraintLayout? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //связали переменную c айди
        helloTextView = findViewById(R.id.helloTextView)
        cLayout = findViewById(R.id.cLayout)


        //указываем что не нулл и приводим к строке переменную
        helloTextView?.setText(number1.toString())


        //запускаем новый поток
        Thread {
            start = true
            //бесконечный цикл только при методе онКриет
            while (start) {
                //запускаем счетчик с 1 секундой
                Thread.sleep(1000)


                    //позваляем менять интерфейс в не основном потоке
                    runOnUiThread {

                        //проверяем на счет и запускаем когда счет дойдёт до 5 и меняем цвет
                        if (counter == 5) cLayout?.setBackgroundColor(Color.BLUE)

                            //указываем что не нулл и приводим к строке переменную
                            helloTextView?.setText(counter.toString())

                            //на увеличение на 1
                            counter++

                    }

                }

                //иначе поток не запустится
            }.start()


    }


    //когда приложение закрывается останавливаем поток с циклом
    override fun onDestroy() {
        super.onDestroy()
        //останавливаем счетчик
        start = false


    }
}