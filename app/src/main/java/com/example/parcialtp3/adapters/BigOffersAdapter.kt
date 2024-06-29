package com.example.parcialtp3.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
//import com.bumptech.glide.Glide
import com.example.parcialtp3.R
import com.example.parcialtp3.entities.CreditsCardsOffers
import com.example.parcialtp3.holders.BigOfferHolder
import com.example.parcialtp3.holders.LittleOfferHolder

class BigOffersAdapter(private val offersList: List<CreditsCardsOffers>) :
    RecyclerView.Adapter<BigOfferHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BigOfferHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.discount_card_big, parent , false)

        return (BigOfferHolder(view))
    }

    override fun getItemCount(): Int = offersList.size

    override fun onBindViewHolder(holder: BigOfferHolder, position: Int) {



        val offer = offersList[position]
        holder.bigTitle.text = offer.bigTitle
        holder.description.text = offer.description
        Glide.with(holder.itemView.context).load(offer.img).into(holder.img)
    }


}