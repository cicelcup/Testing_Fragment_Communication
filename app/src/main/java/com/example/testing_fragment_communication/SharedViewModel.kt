package com.example.testing_fragment_communication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
//    Variables with MutableLiveData (Used them for putting values
//    into it and observe the value

    //    Variable used it without binding
    val _exampleText2 = MutableLiveData<String>("Jorge")

    //    Variable used it with binding
    val _exampleText = MutableLiveData<String>("Jorge")
    val inputNumber: LiveData<String> = _exampleText

//   Function to change the text in the text field (called in the view model)
    fun changeText(){
        _exampleText.value = "JAPM :-)"
        _exampleText2.value = "Jorge Augusto >-)"
    }
}