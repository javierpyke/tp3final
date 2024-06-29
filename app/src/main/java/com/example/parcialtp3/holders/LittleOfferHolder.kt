package com.example.parcialtp3.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.R

class LittleOfferHolder (view: View) : RecyclerView.ViewHolder(view){

        val littleTitle: TextView = itemView.findViewById(R.id.txtDiscountCardLittleTitle)
        val img: ImageView = itemView.findViewById(R.id.imgViewDiscountCardLittleCreditCard)

}