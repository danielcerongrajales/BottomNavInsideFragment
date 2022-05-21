package com.example.bottomnavinsidefragment.ui.initialNavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavinsidefragment.R
import com.example.bottomnavinsidefragment.databinding.FragmentHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var   navControll: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        val nestedNavHostFragment = childFragmentManager.findFragmentById(R.id.nav_host_fragment) as? NavHostFragment
        navControll = nestedNavHostFragment?.navController!!

        val bottomNavigationView = view.findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.setupWithNavController(navControll)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}