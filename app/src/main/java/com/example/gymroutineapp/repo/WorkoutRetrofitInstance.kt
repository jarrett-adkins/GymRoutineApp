package com.example.gymroutineapp.repo

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WorkoutRetrofitInstance {
    val api:WorkoutService by lazy {
        Retrofit.Builder()
            .baseUrl("baseUrl")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WorkoutService::class.java)
    }
}