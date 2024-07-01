package com.example.parcialtp3.providers

import com.example.parcialtp3.R
import com.example.parcialtp3.entities.FoodMarketModel

class FoodMarketProvider{
companion object{
    val foodMarketList = listOf<FoodMarketModel>(
        FoodMarketModel(
            "Big Mouth Burgers",
            "American food",
            "4.6",
            R.drawable.big_mouth_burgers),

        FoodMarketModel(
            "Pizzeria La Farola",
            "Pizza",
            "4.8",
            R.drawable.pizzeria_la_farola),

        FoodMarketModel(
            "Sushi Me",
            "Japanese food",
            "4.4",
            R.drawable.sushi_me)
    )



}
}