package com.example.homeworke5_7

data class WeatherModel(
    val weather: List<Weather>,
    val main: Main,
    val wind: Wind,
    val name: String
)

data class Wind(
    val speed: Double
)

data class Main(
    val temp: Double,
    val humidity: Int
)

data class Weather(
    val main: String,
    val description: String
)