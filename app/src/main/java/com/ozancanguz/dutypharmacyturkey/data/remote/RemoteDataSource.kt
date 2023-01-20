package com.ozancanguz.dutypharmacyturkey.data.remote

import com.ozancanguz.dutypharmacyturkey.data.api.PharmacyApi
import com.ozancanguz.dutypharmacyturkey.data.model.kktc.KktcPharmacy
import com.ozancanguz.dutypharmacyturkey.data.model.turkey.Pharmacy
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource@Inject constructor(private val pharmacyApi: PharmacyApi) {


    suspend fun getDutyPharmacy(il:String): Response<Pharmacy> {
   return     pharmacyApi.getDutyPharmacy(il)
    }


    suspend fun getkktcPharmacy(city:String):Response<KktcPharmacy>{
       return pharmacyApi.getkktcPharmacy(city)
    }
}