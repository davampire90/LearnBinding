package com.example.learnbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.learnbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        /*
        Salim Add code to build.gradle
         buildFeatures {
               viewBinding = true
           }
        */

        //VERSION 1 - Use view binding in activities

             val binding = ActivityMainBinding.inflate(layoutInflater)
             setContentView(binding.root)

             binding.button.setOnClickListener {
                 binding.txtView1.text = "asdasd"
             }



        //VERSION 2 - Use view binding in fragments


    }



}