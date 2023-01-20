package com.ozancanguz.dutypharmacyturkey.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.dutypharmacyturkey.data.model.kktc.KktcPharmacy
import com.ozancanguz.dutypharmacyturkey.data.model.turkey.Pharmacy
import com.ozancanguz.dutypharmacyturkey.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class KKTCViewModel@Inject constructor(private val repository: Repository,application: Application):AndroidViewModel(application) {

    var kktcPharmacyList=MutableLiveData<KktcPharmacy>()


    fun requestkktcData(city:String){
        viewModelScope.launch {
            val response=repository.remote.getkktcPharmacy(city)
            if(response.isSuccessful){
                kktcPharmacyList.postValue(response.body())
            }else{
                Log.d("kktc","no data")
            }
        }
    }


}