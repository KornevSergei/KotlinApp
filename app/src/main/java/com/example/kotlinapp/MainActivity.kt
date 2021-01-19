package com.example.kotlinapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {


    //переменная для поиска <> в строке
    private var text: String = "Если бы <мишки> были <пчелами>, то <они> бы ни по чём никогда бы и не <подумали> так высоко строить <дом>"


    //обозначили переменную ХМЛ
    private var helloTextView1: TextView? = null
    private var helloTextView2: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //связали переменную c айди
        helloTextView1 = findViewById(R.id.helloTextView1)
        helloTextView2 = findViewById(R.id.helloTextView2)

        //переменная для определения элемента
        var subText1: String = text.substringBefore('>')
        var subText2: String = text.substring(3, 9)

        //массив
        var startNumber: Array<Int> = arrayOf(2, 6, 9, 7)
        //получаем номер ячейки массива и перезаписываем
        startNumber[0] = 22

        //другой вариант массива
        var startNumber2 = IntArray(3)
        startNumber2[0] = 55






        //переменаня для счетчика в цикле
        var counter: Int = 0


        //цикл от первого элемента до всей длинны строки не считая последнего элемента Антил
        for (n in text.indices) {
            //проверяем совпадения и сверяем символ, если совпадает увеличиваем на 1
            if (text.get(n) == '<') counter++
        }


            //массив для подсчета элементов в скобки, записываем туда
            //массив с количеством ячеек <
            var startPosition = IntArray(counter)
            //массив с количеством ячеек >
            var endPosition = IntArray(counter)

            var startPcounter:Int = 0
            var endPcounter:Int = 0


            for (n in text.indices) {
                if (text.get(n) == '<'){
                    //записываем в массив позицию скобки
                    startPosition[startPcounter] = n
                    //увеличиваем позицию записи в массив на 1
                    startPcounter++
                }

                if (text.get(n) == '>'){
                    //записываем в массив позицию скобки
                    endPosition[endPcounter] = n
                    //увеличиваем позицию записи в массив на 1
                    endPcounter++
                }
            }


            //массив для соранения полученных слов
            var textFoundArray = Array(counter){""}

            //итоговый цикл для подсчета все полученны слов
            for (n in text.indices){
                //записываесм слова
                textFoundArray[n] = text.substring(startPosition[n] + 1, endPosition[n])

                //выводим в Лог
                Log.d("MyLog", "Слова в масиве: " + textFoundArray[n])




        }


        //устанавливаем текст
        helloTextView1?.setText(text)
        helloTextView2?.setText(counter.toString())


    }

}