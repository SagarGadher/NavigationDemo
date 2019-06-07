package com.example.navigationdemo


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigationdemo.databinding.LayoutFragmentSecondBinding
import kotlin.random.Random

class SecondFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: LayoutFragmentSecondBinding =
            DataBindingUtil.inflate(inflater, R.layout.layout_fragment_second, container, false)
        binding.btnPlay.setOnClickListener{
            when (val i: Int = Random.nextInt(5)) {
                1, 3, 5 -> it.findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdAFragment())
                0, 2, 4 -> it.findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdBFragment(i))
                else ->it.findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdAFragment())
            }
        }
        /*binding.btnPlay.setOnClickListener(
            when (Random.nextInt(5)) {
                1, 3, 5 -> Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_thirdAFragment)
                0, 2, 4 -> Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_thirdBFragment)
                else -> Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_thirdAFragment)
            }
        )*/
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.about_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController()) || super.onOptionsItemSelected(
            item
        )
    }
}