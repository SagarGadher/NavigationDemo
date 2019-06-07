package com.example.navigationdemo


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationdemo.databinding.LayoutFragmentFirstBinding


class FirstFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: LayoutFragmentFirstBinding = DataBindingUtil.inflate(inflater, R.layout.layout_fragment_first, container, false)
        binding.btnSendToSecond.setOnClickListener(
                //3 and best way
                Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment)
        )
        /*binding.btnSendToSecond.setOnClickListener {
            //2 way it.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
            //1 way Navigation.findNavController(it).navigate(R.id.action_firstFragment_to_secondFragment)
        }*/
        return binding.root
    }


}
