package com.example.foody.retrofit


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiUtilites{
    val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"

    fun getRetrofitInstance(): Retrofit{
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
