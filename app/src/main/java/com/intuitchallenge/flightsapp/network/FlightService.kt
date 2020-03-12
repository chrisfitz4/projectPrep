package com.intuitchallenge.flightsapp.network

import com.intuitchallenge.flightsapp.model.flight.FlightDetails
import com.intuitchallenge.flightsapp.model.price.Price
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface FlightService {

    @GET("chrisfitz4/projectPrep/master/flights.json")
    fun getFlightInformation() : Observable<List<FlightDetails>>

    @GET("chrisfitz4/projectPrep/master/flightsPrices/{flightPath}.json")
    fun getPriceInformation(
        @Path("flightPath") path : String
    ) : Observable<Price>
}