package com.cevlikalprn.makesimplegetrequest.api

import com.cevlikalprn.makesimplegetrequest.util.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val service : DogService by lazy {
        retrofit.create(DogService::class.java)
    }
}