package com.example.navigationdemo

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigationdemo.databinding.LayoutActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding:LayoutActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.layout_activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.layout_activity_main)

        val mNavController = this.findNavController(R.id.navHostFragment)
        NavigationUI.setupActionBarWithNavController(this,mNavController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.navHostFragment)
        return navController.navigateUp()
    }
}
