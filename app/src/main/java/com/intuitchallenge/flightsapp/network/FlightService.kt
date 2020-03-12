package com.intuitchallenge.flightsapp.network

import io.reactivex.Observable

interface FlightService {

    fun getFlightInformation() : Observable<Any>

    fun getPriceInformation() : Observable<Any>
}