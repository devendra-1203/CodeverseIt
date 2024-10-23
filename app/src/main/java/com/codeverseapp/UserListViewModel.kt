package com.codeverseapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class UserListViewModel : ViewModel() {
    private  val _data = MutableLiveData<List<UserListData>>()
    val data: LiveData<List<UserListData>> get() = _data



    fun fetchData(){
        viewModelScope.launch {
            try {
                val response = RetrofitInsatance.api.getUsers("","")
                if(response != null){
                    _data.postValue(response.data)
                }
            }catch (e : Exception){
                e.printStackTrace()
            }
        }
    }



}