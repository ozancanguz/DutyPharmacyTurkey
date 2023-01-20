package com.ozancanguz.dutypharmacyturkey.data.model.kktc


import com.google.gson.annotations.SerializedName

data class KktcPharmacy(
    @SerializedName("result")
    val result: List<Result>,
    @SerializedName("success")
    val success: Boolean
)