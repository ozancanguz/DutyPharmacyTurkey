package com.ozancanguz.dutypharmacyturkey.data.model.turkey


import com.google.gson.annotations.SerializedName

data class Pharmacy(
    @SerializedName("result")
    val result: List<Result>,
    @SerializedName("success")
    val success: Boolean
)