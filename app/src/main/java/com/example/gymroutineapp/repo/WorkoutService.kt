package com.example.gymroutineapp.repo

import com.example.gymroutineapp.model.Routine
import retrofit2.Call
import retrofit2.http.GET

interface WorkoutService {
    companion object {
        const val URL = "data.json"
    }

    @GET(URL)
    fun getGymRoutine(): Call<Routine>
}