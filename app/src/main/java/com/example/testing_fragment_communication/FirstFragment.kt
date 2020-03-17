package com.example.testing_fragment_communication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {
    private lateinit var sharedViewModel:SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            sharedViewModel = ViewModelProvider(it)
                .get(SharedViewModel::class.java)
        }
        val button: Button = view.findViewById(R.id.button)
        button.setOnClickListener {
            //put the value for the binding
            sharedViewModel._exampleText.postValue("JAPM")
            //put the value for the observer
            sharedViewModel._exampleText2.postValue("Jorge Augusto")
        }
    }
}
