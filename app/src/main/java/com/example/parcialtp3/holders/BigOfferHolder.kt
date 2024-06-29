package com.example.parcialtp3.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.R

class BigOfferHolder (view: View) : RecyclerView.ViewHolder(view){

        val bigTitle: TextView = itemView.findViewById(R.id.txtDiscountCardBigTitle)
        val description: TextView = itemView.findViewById(R.id.txtDiscountCardBigDescription)
        val img: ImageView = itemView.findViewById(R.id.imgViewDiscountCardBigCreditCard)

}