package com.example.homeworke5_7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(private val repository: Repository): ViewModel() {

    private val liveData = MutableLiveData<WeatherModel?>(null)
    val publicLiveData: LiveData<WeatherModel?>

    init {
        publicLiveData = liveData
    }

    fun getWeather(city: String){
        repository.getWeather(city, liveData)
    }

}