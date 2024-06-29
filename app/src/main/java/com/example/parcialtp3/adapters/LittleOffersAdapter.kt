package com.example.parcialtp3.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
//import com.bumptech.glide.Glide
import com.example.parcialtp3.R
import com.example.parcialtp3.entities.CreditsCardsOffers
import com.example.parcialtp3.holders.LittleOfferHolder

class LittleOffersAdapter(private val offersList: List<CreditsCardsOffers>) :
    RecyclerView.Adapter<LittleOfferHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LittleOfferHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.discount_card_little, parent,false)

        return (LittleOfferHolder(view))
    }

    override fun getItemCount(): Int = offersList.size

    override fun onBindViewHolder(holder: LittleOfferHolder, position: Int) {



        val offer = offersList[position]
        holder.littleTitle.text = offer.littleTitle
        Glide.with(holder.itemView.context).load(offer.img).into(holder.img)
    }


}