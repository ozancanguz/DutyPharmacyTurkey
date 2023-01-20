package com.ozancanguz.dutypharmacyturkey.data


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("address")
    val address: String,
    @SerializedName("dist")
    val dist: String,
    @SerializedName("loc")
    val loc: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("phone")
    val phone: String
)