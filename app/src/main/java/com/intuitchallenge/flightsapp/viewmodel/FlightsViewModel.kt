package com.intuitchallenge.flightsapp.viewmodel

import androidx.lifecycle.ViewModel
import com.intuitchallenge.flightsapp.model.flight.FlightDetails
import com.intuitchallenge.flightsapp.network.FlightsRetrofit
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class FlightsViewModel @Inject constructor(val flightsRetrofit: FlightsRetrofit) : ViewModel(){

    companion object{
        fun <T> Observable<T>.subscriber() : Observable<T>{
            return this.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
        }
    }

    fun getFlightsInfo() = flightsRetrofit.getFlightsInfo().subscriber()

    fun getPriceInfo(path: String) = flightsRetrofit.getPriceInfo(path).subscriber()
}