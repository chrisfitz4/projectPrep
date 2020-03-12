package com.intuitchallenge.flightsapp.model.price

data class Price(
    val currency: String,
    val flight_number: String,
    val from: String,
    val price: Int,
    val seats: Int,
    val to: String
)