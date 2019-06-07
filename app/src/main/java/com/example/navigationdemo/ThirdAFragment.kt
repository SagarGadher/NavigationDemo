package com.example.navigationdemo


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigationdemo.databinding.LayoutFragmentThirdABinding
import kotlinx.android.synthetic.main.layout_fragment_third_a.view.*

class ThirdAFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: LayoutFragmentThirdABinding = DataBindingUtil.inflate(inflater,R.layout.layout_fragment_third_a,container,false)
        binding.btnPlayAgain.setOnClickListener{
            it.findNavController().navigate(ThirdAFragmentDirections.actionThirdAFragmentToSecondFragment())
        }
        return  binding.root
    }


}
