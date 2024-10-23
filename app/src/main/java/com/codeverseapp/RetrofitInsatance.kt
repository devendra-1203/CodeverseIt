package com.codeverseapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInsatance {

  private const val BASE_URL = "http://16.170.215.79:9000/"


    val api : GETAPI by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GETAPI::class.java)
    }
}