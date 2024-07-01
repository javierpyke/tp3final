package com.example.parcialtp3.entities


import android.os.Parcel
import android.os.Parcelable

data class FoodMarketModel(
    var name:String,
    var description:String,
    var qualification:String,
    var imageResId:Int
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeString(qualification)
        parcel.writeInt(imageResId)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FoodMarketModel> {
        override fun createFromParcel(parcel: Parcel): FoodMarketModel {
            return FoodMarketModel(parcel)
        }

        override fun newArray(size: Int): Array<FoodMarketModel?> {
            return arrayOfNulls(size)
        }
    }
}
