package com.example.testing_fragment_communication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    val _inputNumber = MutableLiveData<String>("Jorge")
    val inputNumber:LiveData<String> = _inputNumber
}