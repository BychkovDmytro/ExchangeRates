package com.lokilinks.retrofit.sreans.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lokilinks.retrofit.data.repository.Repository
import com.lokilinks.retrofit.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel:ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()
        }
    }


}