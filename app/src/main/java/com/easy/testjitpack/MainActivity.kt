package com.easy.testjitpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.easy.mylibrary.Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = Test.test
//        Test.testFrom2
    }
}