package com.example.testing_fragment_communication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private val firstFragment = FirstFragment()
    private val secondFragment = SecondFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentTransaction =
            supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_one,firstFragment)
        fragmentTransaction.commit()

        val fragmentTransaction2 =
            supportFragmentManager.beginTransaction()
        fragmentTransaction2.replace(R.id.frame_two,secondFragment)
        fragmentTransaction2.commit()

        val vm:SharedViewModel = ViewModelProvider(this)
            .get(SharedViewModel::class.java)
    }
}
