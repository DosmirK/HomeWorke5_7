package com.example.homeworke5_7

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("data/2.5/weather")
    fun getWeather(
        @Query("q") city: String,
        @Query("appid") apiKey: String = "36cbf21e77603d1848c9293fd5e5ba31",
        @Query("units") units: String = "metric"
    ): retrofit2.Call<WeatherModel>
}