package com.example.parcialtp3.api

import retrofit2.http.GET


interface ApiService {
    @GET("search?engine=google_flights&api_key=123&departure_id=EZE&arrival_id=MIA&outbound_date=2024-05-31&return_date=2024-06-10")
    suspend fun getFlights(): FlightResponse
}