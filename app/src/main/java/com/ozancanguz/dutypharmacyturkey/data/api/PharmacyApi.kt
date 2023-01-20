package com.ozancanguz.dutypharmacyturkey.data.api

import com.ozancanguz.dutypharmacyturkey.data.model.Pharmacy
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface PharmacyApi {

    @Headers(
        "authorization: apikey 4S9qz1vJllFEUXdg2X6UxT:00p5DeCL7r6zj9xXkIoKmw",
        "content-type: application/json"
    )
    @GET("dutyPharmacy")
    suspend fun getDutyPharmacy(@Query("il")il:String):Response<Pharmacy>


}