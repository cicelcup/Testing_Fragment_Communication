package com.example.testing_fragment_communication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
//    Definition of the fragments
    private val firstFragment = FirstFragment()
    private val secondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Adding first fragment to the activity
        val fragmentTransaction =
            supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_one,firstFragment)
        fragmentTransaction.commit()

//        Adding second fragment to the activity
        val fragmentTransaction2 =
            supportFragmentManager.beginTransaction()
        fragmentTransaction2.replace(R.id.frame_two,secondFragment)
        fragmentTransaction2.commit()

//        Adding View Model to the activity
        val vm:SharedViewModel = ViewModelProvider(this)
            .get(SharedViewModel::class.java)
    }
}
