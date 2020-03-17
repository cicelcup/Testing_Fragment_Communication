package com.example.testing_fragment_communication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    private val _name = MutableLiveData("Jorge")

    val name: LiveData<String> = _name

//    fun changeName()
//    {
//        _likes.value = (_likes.value ?: 0) + 1
//        _name.value = "Jorge ${_likes.value}"
//        _lastName.value = "Peroza ${_likes.value}"
//    }

}