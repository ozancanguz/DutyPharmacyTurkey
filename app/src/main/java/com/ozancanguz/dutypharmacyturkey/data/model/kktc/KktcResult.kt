package com.ozancanguz.dutypharmacyturkey.data.model.kktc


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KktcResult(
    @SerializedName("address")
    val address: String,
    @SerializedName("dist")
    val dist: String,
    @SerializedName("key")
    val key: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("phone")
    val phone: String
):Parcelable