package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parcialtp3.R
import com.example.parcialtp3.adapters.BestDestinationAdapter
import com.example.parcialtp3.databinding.FragmentExploreBinding
import com.example.parcialtp3.entities.BestDestinationModel
import com.example.parcialtp3.holders.OnViewItemClickedListener
import com.example.parcialtp3.providers.BestDestinationProvider

class Explore : Fragment() , OnViewItemClickedListener {

    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!
    private lateinit var bestDestinationAdapter: BestDestinationAdapter



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentExploreBinding.inflate(inflater, container, false)
        val bestDestinationAdapter = BestDestinationAdapter(BestDestinationProvider.bestDestinationList,this)
        binding.trendingDestinations.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.trendingDestinations.adapter = bestDestinationAdapter

        return binding.root


    }

    override fun onViewItemDetail(negocio: BestDestinationModel){
        view?.findNavController()?.navigate(ExploreDirections.actionExploreToProfile(negocio))
    }


}