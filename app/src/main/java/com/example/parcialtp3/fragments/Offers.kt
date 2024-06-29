package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.adapters.BigOffersAdapter
import com.example.parcialtp3.adapters.LittleOffersAdapter
import com.example.parcialtp3.databinding.FragmentOffersBinding
import com.example.parcialtp3.databinding.FragmentSearchBinding
import com.example.parcialtp3.providers.CreditCardsOffersProvider

class Offers : Fragment() {

    private lateinit var offersRecycleView: RecyclerView
    private lateinit var bigOffersAdapter: BigOffersAdapter
    private var _binding: FragmentOffersBinding? =null
    private val binding get() = _binding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentOffersBinding.inflate(inflater,container,false)

        offersRecycleView = _binding!!.recyclerBigOffers
        offersRecycleView.layoutManager = LinearLayoutManager(context)
        bigOffersAdapter = BigOffersAdapter(CreditCardsOffersProvider.creditCardsOffersList)

        offersRecycleView.adapter = bigOffersAdapter

        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}