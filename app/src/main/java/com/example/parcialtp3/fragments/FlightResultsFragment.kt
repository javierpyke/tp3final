package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.R
import com.example.parcialtp3.adapters.FlightResultsAdapter
import com.example.parcialtp3.databinding.FragmentFlightResultsBinding
import com.example.parcialtp3.entities.FlightResults
import com.example.parcialtp3.api.RetrofitClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FlightResultsFragment : Fragment() {

    private lateinit var flightAdapter: FlightResultsAdapter
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentFlightResultsBinding? = null
    private val binding get() = _binding!!



    companion object {
        fun newInstance() = FlightResultsFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFlightResultsBinding.inflate(inflater, container, false)
        recyclerView = binding.recyclerFlightsResults
        recyclerView.layoutManager = LinearLayoutManager(this.context)
        flightAdapter = FlightResultsAdapter(emptyList())
        recyclerView.adapter = flightAdapter


        fetchFlights()



        return binding.root
    }

    private fun  fetchFlights() {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = RetrofitClient.apiService.getFlights()
                val flights = response.best_flights.map { bestFlight ->
                    bestFlight.flights.firstOrNull()?.let { flight ->
                        FlightResults(
                            airline = flight.airline,
                            duration = flight.duration,
                            departure_airport = flight.departure_airport,
                            arrival_airport = flight.arrival_airport,
                            travel_class = flight.travel_class,
                            airline_logo = flight.airline_logo,
                            airplane = flight.airplane,
                            extensions = flight.extensions,
                            flight_number = flight.flight_number,
                            legroom = flight.legroom,
                            often_delayed_by_over_30_min = flight.often_delayed_by_over_30_min,
                            overnight = flight.overnight,
                            price = bestFlight.price
                        )
                    }
                }.filterNotNull()

                withContext(Dispatchers.Main) {
                    flightAdapter.updateFlights(flights)
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}