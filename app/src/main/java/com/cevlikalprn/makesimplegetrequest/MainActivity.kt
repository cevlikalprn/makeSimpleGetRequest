package com.cevlikalprn.makesimplegetrequest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    //test
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getDog()
        viewModel.dogLiveData.observe(this) { dogImage ->
            dogImage?.let {
                Log.d("DOG_SERVICE_RESPONSE", "Dog Service Messages -> ${it.message}")
            } ?: kotlin.run {
                Log.d("DOG_SERVICE_RESPONSE", "error")
            }
        }
    }
}