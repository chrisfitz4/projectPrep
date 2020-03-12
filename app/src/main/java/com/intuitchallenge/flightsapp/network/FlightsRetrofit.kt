package com.intuitchallenge.flightsapp.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class FlightsRetrofit {

    companion object{
        const val BASE_URL = ""
    }

    val retrofit : Retrofit by lazy{
        Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    val flightService : FlightService by lazy {
        retrofit.create(FlightService::class.java)
    }

    fun getFlightsInfo() = flightService.getFlightInformation()
    fun getPriceInfo() = flightService.getPriceInformation()
}