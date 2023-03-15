package com.example.a18_01_2023_fragmentday1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a18_01_2023_fragmentday1.databinding.CurrencyFragmentBinding
import kotlin.random.Random

class CurrencyFragment : Fragment() {
    private lateinit var binding : CurrencyFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CurrencyFragmentBinding.inflate(inflater)
        initializeListeners()
        return binding.root
    }

    private fun initializeListeners(){
        binding.btnConvert.setOnClickListener {
            var random = Random(System.currentTimeMillis())
            var inrValue = Math.abs(random.nextFloat() * 100)
            binding.txtINR.text = "INR : $inrValue"
        }
    }


}