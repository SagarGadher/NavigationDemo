package com.example.navigationdemo


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navigationdemo.databinding.LayoutFragmentThirdBBinding

class ThirdBFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: LayoutFragmentThirdBBinding =
            DataBindingUtil.inflate(inflater, R.layout.layout_fragment_third_b, container, false)

        binding.btnTryAgain.setOnClickListener {
            it.findNavController().navigate(ThirdBFragmentDirections.actionThirdBFragmentToSecondFragment())
        }
        return binding.root
    }
}
