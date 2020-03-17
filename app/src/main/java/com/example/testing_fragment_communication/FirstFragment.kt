package com.example.testing_fragment_communication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.testing_fragment_communication.databinding.FragmentFirstBinding
import com.example.testing_fragment_communication.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {
    private lateinit var sharedViewModel:SharedViewModel
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.let {
            //adding the viewModel to the fragment
            sharedViewModel = ViewModelProvider(it)
                .get(SharedViewModel::class.java)
            //Adding the view model to the binding
            binding.viewModel = sharedViewModel
        }
    }
}
