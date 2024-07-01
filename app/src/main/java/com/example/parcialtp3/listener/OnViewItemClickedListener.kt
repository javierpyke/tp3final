package com.example.parcialtp3.holders

import com.example.parcialtp3.entities.FoodMarketModel

interface OnViewItemClickedListener {
    fun onViewItemDetail(negocio: FoodMarketModel)
}