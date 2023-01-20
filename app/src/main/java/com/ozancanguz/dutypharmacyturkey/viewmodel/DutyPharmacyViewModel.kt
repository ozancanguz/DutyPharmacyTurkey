package com.ozancanguz.dutypharmacyturkey.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.dutypharmacyturkey.data.model.turkey.Pharmacy
import com.ozancanguz.dutypharmacyturkey.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DutyPharmacyViewModel @Inject constructor(private val repository: Repository, application: Application):AndroidViewModel(application) {


    var dutyPharmacyList=MutableLiveData<Pharmacy>()

    fun requestApiData(il:String){

        viewModelScope.launch {
            val response=repository.remote.getDutyPharmacy(il)
            if(response.isSuccessful){
                dutyPharmacyList.postValue(response.body())
            }else{
                Log.d("viewmodel","NO DATA")
            }
        }
    }


}