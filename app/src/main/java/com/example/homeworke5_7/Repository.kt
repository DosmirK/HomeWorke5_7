package com.example.homeworke5_7

import android.util.Log
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject
import retrofit2.Callback

class Repository @Inject constructor(private val api: WeatherApi) {

    fun getWeather(
        city: String,
        liveData: MutableLiveData<WeatherModel?>
    ){
        api.getWeather(city = city).enqueue(object : Callback<WeatherModel>{
            override fun onResponse(call: Call<WeatherModel>, response: Response<WeatherModel>) {
                if (response.isSuccessful){
                    response.body()?.let {
                        liveData.postValue(it)
                    }
                }
            }

            override fun onFailure(call: Call<WeatherModel>, t: Throwable) {
                Log.e("ololo", "onFailure: ${t.message}")
            }
        })
    }
}