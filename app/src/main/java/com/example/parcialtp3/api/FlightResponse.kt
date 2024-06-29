package com.example.parcialtp3.api

import com.example.parcialtp3.entities.BestFlight

data class FlightResponse(
    val best_flights: List<BestFlight>
)