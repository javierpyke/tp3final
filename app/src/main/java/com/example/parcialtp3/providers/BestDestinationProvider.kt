package com.example.parcialtp3.providers

import com.example.parcialtp3.R
import com.example.parcialtp3.entities.BestDestinationModel

class BestDestinationProvider{
companion object{
    val bestDestinationList = listOf<BestDestinationModel>(
        BestDestinationModel(
            "Big Mouth Burgers",
            "American food",
            "4.6",
            R.drawable.big_mouth_burgers),

        BestDestinationModel(
            "Pizzeria La Farola",
            "Pizza",
            "4.8",
            R.drawable.pizzeria_la_farola),

        BestDestinationModel(
            "Sushi Me",
            "Japanese food",
            "4.4",
            R.drawable.sushi_me)
    )



}
}