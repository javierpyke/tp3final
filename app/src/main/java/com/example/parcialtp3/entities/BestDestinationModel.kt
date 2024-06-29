package com.example.parcialtp3.entities


import android.os.Parcel
import android.os.Parcelable

data class BestDestinationModel(
    var title:String,
    var description:String,
    var code:String,
    var imageResId:Int
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(description)
        parcel.writeString(code)
        parcel.writeInt(imageResId)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BestDestinationModel> {
        override fun createFromParcel(parcel: Parcel): BestDestinationModel {
            return BestDestinationModel(parcel)
        }

        override fun newArray(size: Int): Array<BestDestinationModel?> {
            return arrayOfNulls(size)
        }
    }
}
