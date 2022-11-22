package com.cevlikalprn.makesimplegetrequest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cevlikalprn.makesimplegetrequest.api.RetrofitInstance
import com.cevlikalprn.makesimplegetrequest.modal.Dog
import kotlinx.coroutines.launch

class MainViewModel(): ViewModel() {

    private val _dogLiveData: MutableLiveData<Dog?> = MutableLiveData()
    val dogLiveData: LiveData<Dog?>
        get() = _dogLiveData

     fun getDog() {
         viewModelScope.launch {
             _dogLiveData.value = RetrofitInstance.service.getDog()
         }
     }
}