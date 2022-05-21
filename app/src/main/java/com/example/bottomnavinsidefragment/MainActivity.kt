package com.example.bottomnavinsidefragment

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import com.example.bottomnavinsidefragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        listenBackStackChange()

    }
    private fun listenBackStackChange() {
        // Get NavHostFragment
        val navHostFragment =  supportFragmentManager.findFragmentById(R.id.fragmentContainerView)

        // ChildFragmentManager of NavHostFragment
        val navHostChildFragmentManager = navHostFragment?.childFragmentManager

        navHostChildFragmentManager?.addOnBackStackChangedListener {

            val backStackEntryCount = navHostChildFragmentManager.backStackEntryCount
            val fragments = navHostChildFragmentManager.fragments

            Log.d("tag","🎃 Main graph backStackEntryCount: $backStackEntryCount, fragments: $fragments")

//
        }
    }
}