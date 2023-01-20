package com.ozancanguz.dutypharmacyturkey.data.api

import com.ozancanguz.dutypharmacyturkey.data.model.Pharmacy
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PharmacyApi {

    @GET("dutyPharmacy")
    suspend fun getDutyPharmacy(@Query("il")il:String):Response<Pharmacy>


}