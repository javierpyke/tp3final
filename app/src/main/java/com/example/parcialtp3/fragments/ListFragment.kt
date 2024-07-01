package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.parcialtp3.adapters.FoodMarketAdapter
import com.example.parcialtp3.databinding.FragmentListBinding
import com.example.parcialtp3.entities.FoodMarketModel
import com.example.parcialtp3.holders.OnViewItemClickedListener
import com.example.parcialtp3.providers.FoodMarketProvider

class ListFragment : Fragment() , OnViewItemClickedListener {

    private var _binding: FragmentListBinding? = null
    private val binding get() = _binding!!
    private lateinit var foodMarketAdapter: FoodMarketAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentListBinding.inflate(inflater, container, false)
        foodMarketAdapter = FoodMarketAdapter(FoodMarketProvider.foodMarketList,this)
        binding.foodMarkets.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.foodMarkets.adapter = foodMarketAdapter

        return binding.root
    }
    override fun onViewItemDetail(negocio: FoodMarketModel){
        view?.findNavController()?.navigate(ListFragmentDirections.actionListToDetails(negocio))
    }
}