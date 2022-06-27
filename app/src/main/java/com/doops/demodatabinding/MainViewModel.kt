package com.doops.demodatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _count = MutableStateFlow(0)
    val count get() = _count.asStateFlow()

    val myCountry = MutableStateFlow<String?>(null)
    val country get() = myCountry.asStateFlow()


    fun increaseCounter() = viewModelScope.launch(Dispatchers.IO) {
        _count.value = _count.value + 1
    }
}