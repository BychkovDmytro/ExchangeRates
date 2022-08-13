package com.lokilinks.retrofit.data.repository

import com.lokilinks.retrofit.data.api.RetrofitInstance
import com.lokilinks.retrofit.model.beznal.Beznal
import com.lokilinks.retrofit.model.nal.Nalichka

import retrofit2.Response

class Repository {


    suspend fun getNal():Response<Nalichka>{
        return RetrofitInstance.api.getNalMoney()
    }

    suspend fun getBeznal():Response<Beznal>{
        return RetrofitInstance.api.getBezalMoney()
    }

}