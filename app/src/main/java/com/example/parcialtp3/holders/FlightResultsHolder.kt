package com.example.parcialtp3.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.R

class FlightResultsHolder (view: View) : RecyclerView.ViewHolder(view){

        val airline: TextView = itemView.findViewById(R.id.txtViewCompanyNameFlyCard)
        val duration: TextView = itemView.findViewById(R.id.txtViewDurationFlyCard)
        val departureAirport: TextView = itemView.findViewById(R.id.txtViewFromAirportNameFlyCard)
        val departureAirportId: TextView = itemView.findViewById(R.id.txtViewFromAirportFlyCard)
        val arrivalAirport: TextView = itemView.findViewById(R.id.txtViewToAirportNameFlyCard)
        val arrivalAirportId: TextView = itemView.findViewById(R.id.txtViewToAirportFlyCard)
        val travelClass: TextView = itemView.findViewById(R.id.txtViewClasstFlyCard)
        val price: TextView = itemView.findViewById(R.id.txtViewPriceFlyCard)
        val airlineLogo: ImageView = itemView.findViewById(R.id.imgViewLogoCompanyFlyCard)

}