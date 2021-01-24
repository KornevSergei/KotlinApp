package com.example.kotlinapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    //клик на кнопку
    fun startActivity(view: View) {

        //указываем из какого активити и куда и делаем переход // так же предаем информацию в новый интент ключ-значение
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("Hello!","Привет с основного активити )")
        }
        startActivity(intent)
    }

}