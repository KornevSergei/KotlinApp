package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    //оздали лист
    var listView: ListView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //связали
        listView = findViewById(R.id.listView)

        //массив для элеентов списка
        var nameList = ArrayList<String>()
        //доюавляем элементы
        nameList.add("Иван")
        nameList.add("Ирина")
        nameList.add("Сергей")
        nameList.add("Степан")
        nameList.add("Евгений")

        //оздаём адаптер для листВью , присвоили шаблон для отоброжения и заполнили его элементами массива
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)
        //присвоили адаптер
        listView?.adapter = adapter




    }
}