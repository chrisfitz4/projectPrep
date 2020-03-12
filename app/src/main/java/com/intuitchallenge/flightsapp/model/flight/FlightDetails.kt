package com.intuitchallenge.flightsapp.model.flight

import com.intuitchallenge.flightsapp.model.flight.Airline

data class FlightDetails(
    val airline: Airline,
    val arrival: String,
    val departure: String,
    val duration: String,
    val flight_number: String,
    val from: String,
    val instructions: String,
    val stops: Int,
    val to: String
)