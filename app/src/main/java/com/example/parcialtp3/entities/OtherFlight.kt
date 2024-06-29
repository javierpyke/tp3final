package com.example.parcialtp3.entities

data class OtherFlight(
    val airline_logo: String,
    val carbon_emissions: CarbonEmissions,
    val departure_token: String,
    val flights: List<FlightX>,
    val layovers: List<Layover>,
    val price: Int,
    val total_duration: Int,
    val type: String
)