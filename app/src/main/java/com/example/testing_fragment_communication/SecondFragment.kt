package com.example.testing_fragment_communication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testing_fragment_communication.databinding.FragmentSecondBinding
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {
    private lateinit var sharedViewModel: SharedViewModel
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment using binding
        binding = FragmentSecondBinding.inflate(
            layoutInflater, container, false
        )
        return binding.root
    }

    //It's need it after the view is created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Set the view model sharing with the activity
        activity?.let {
            sharedViewModel = ViewModelProvider(it)
                .get(SharedViewModel::class.java)
            //Observe the value of the variable
            sharedViewModel._exampleText2
                .observe(it, Observer { binding.textView3.text = it })
            //Associate the view model to the binding
            binding.viewModel = sharedViewModel
            binding.lifecycleOwner = it
        }
    }
}
