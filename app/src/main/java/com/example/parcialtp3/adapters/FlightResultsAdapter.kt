package com.example.parcialtp3.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
//import com.bumptech.glide.Glide
import com.example.parcialtp3.R
import com.example.parcialtp3.entities.CreditsCardsOffers
import com.example.parcialtp3.entities.FlightResults
import com.example.parcialtp3.holders.BigOfferHolder
import com.example.parcialtp3.holders.FlightResultsHolder
import com.example.parcialtp3.holders.LittleOfferHolder

class FlightResultsAdapter(private var flightResultsList: List<FlightResults>) :
    RecyclerView.Adapter<FlightResultsHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightResultsHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.fly_card, parent, false)
        return FlightResultsHolder(view)
    }

    override fun onBindViewHolder(holder: FlightResultsHolder, position: Int) {
        val flightResult = flightResultsList[position]

        holder.airline.text = flightResult.airline
        holder.duration.text = "${flightResult.duration} min"
        holder.departureAirportId.text = flightResult.departure_airport.id
        holder.arrivalAirportId.text = flightResult.arrival_airport.id
        holder.departureAirport.text = flightResult.departure_airport.name
        holder.arrivalAirport.text = flightResult.arrival_airport.name
        holder.travelClass.text = flightResult.travel_class
        holder.price.text = "$ ${flightResult.price}"
        Glide.with(holder.itemView.context).load(flightResult.airline_logo).into(holder.airlineLogo)
    }


    override fun getItemCount(): Int = flightResultsList.size

    fun updateFlights(newFlights: List<FlightResults>) {
        flightResultsList = newFlights
        notifyDataSetChanged()
    }

}