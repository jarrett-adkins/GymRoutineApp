package com.example.gymroutineapp.model

data class Routine(
    val workouts: List<Workout>? = emptyList()
)

data class Workout(
    val amount: String? = null,
    val exercises: List<String>? = null
)