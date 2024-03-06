package com.example.homeworke5_7

import java.io.Serializable

data class WeatherModel(
    val weather: List<Weather>,
    val main: Main,
    val wind: Wind,
    val name: String
): Serializable

data class Wind(
    val speed: Double
)

data class Main(
    val temp: Double,
    val humidity: Int
)

data class Weather(
    var main: String,
    var description: String
)