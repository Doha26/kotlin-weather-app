package com.pavel.weather.data.network.response

import com.google.gson.annotations.SerializedName
import com.pavel.weather.data.db.entity.CurrentWeatherEntry
import com.pavel.weather.data.db.entity.LocationWeatherEntry
import com.pavel.weather.data.db.Request


data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    @SerializedName("location")
    val locationWeatherEntry: LocationWeatherEntry,
    val request: Request
)