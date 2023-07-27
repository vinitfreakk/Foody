package com.example.foody.retrofit

import com.example.foody.models.MealList
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
   @GET("random.php")
   suspend fun getRandomMeal():Response<MealList>
}