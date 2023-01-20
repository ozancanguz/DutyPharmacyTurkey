package com.ozancanguz.dutypharmacyturkey.data.model.kktc


import com.google.gson.annotations.SerializedName

data class Result(
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
)