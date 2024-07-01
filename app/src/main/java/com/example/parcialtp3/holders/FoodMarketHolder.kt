package com.example.parcialtp3.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcialtp3.R
import com.example.parcialtp3.entities.FoodMarketModel

class FoodMarketHolder (view: View) : RecyclerView.ViewHolder(view)  {

    val title = view.findViewById<TextView>(R.id.txtViewFoodMarketTitleItem)
    val description = view.findViewById<TextView>(R.id.txtViewFoodMarketDescItem)
    val code = view.findViewById<TextView>(R.id.txtViewFoodMarketQualificationItem)
    val image = view.findViewById<ImageView>(R.id.imgViewFoodMarketItem)

    private var view: View

    init {
        this.view = view
    }
    fun render(model: FoodMarketModel){
        title.text = model.name
        description.text = model.description
        code.text = model.qualification
        Glide.with(image.context).load(model.imageResId).into(image)

    }

    fun getCardLayout (): CardView {
        return view.findViewById(R.id.card_package_item)
    }
}