package com.ozancanguz.dutypharmacyturkey.data.model


import com.google.gson.annotations.SerializedName
import com.ozancanguz.dutypharmacyturkey.data.model.Result

data class Pharmacy(
    @SerializedName("result")
    val result: List<Result>,
    @SerializedName("success")
    val success: Boolean
)