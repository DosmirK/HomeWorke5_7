package com.example.homeworke5_7

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.homeworke5_7.databinding.FragmentWeatherBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeatherFragment : Fragment() {

    private var _binding: FragmentWeatherBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWeatherBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val model = arguments?.getSerializable("model") as WeatherModel

        model.weather.forEach { weatherItem ->
            val description = weatherItem.description
            val main = weatherItem.main

            binding.tvTemp.text = model.main.temp.toString() + "°"
            binding.tvCity.text = model.name
            binding.tvDescription.text =
                " Влажность: ${model.main.humidity}%\n Скорость ветра: ${model.wind.speed} км/ч\n Описание: $description"
        }
    }
}