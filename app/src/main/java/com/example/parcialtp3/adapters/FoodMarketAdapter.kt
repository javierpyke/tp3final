package com.example.parcialtp3.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.R
import com.example.parcialtp3.entities.FoodMarketModel
import com.example.parcialtp3.holders.FoodMarketHolder
import com.example.parcialtp3.holders.OnViewItemClickedListener


class FoodMarketAdapter (private val foodMarketslist: List<FoodMarketModel>,private val onItemClick: OnViewItemClickedListener) : RecyclerView.Adapter<FoodMarketHolder>() {



        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodMarketHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return FoodMarketHolder(layoutInflater.inflate(R.layout.food_market_item, parent, false))
        }
        override fun getItemCount(): Int = foodMarketslist.size

        override fun onBindViewHolder(holder: FoodMarketHolder, position: Int) {
            val foodMarket = foodMarketslist[position]
            holder.render(foodMarket)

            holder.getCardLayout().setOnClickListener{
                onItemClick.onViewItemDetail(foodMarket)
            }
        }

    }
