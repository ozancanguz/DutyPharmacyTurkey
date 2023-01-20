package com.ozancanguz.dutypharmacyturkey.data.repository

import com.ozancanguz.dutypharmacyturkey.data.remote.RemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository @Inject constructor(remoteDataSource: RemoteDataSource){

    val remote=remoteDataSource
}