package com.ozancanguz.dutypharmacyturkey.data.model.kktc


import com.google.gson.annotations.SerializedName

data class KktcPharmacy(
    @SerializedName("result")
    val kktcResult: List<KktcResult>,
    @SerializedName("success")
    val success: Boolean
)