package com.example.bottomnavinsidefragment.ui.secondNavigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.bottomnavinsidefragment.R
import com.example.bottomnavinsidefragment.databinding.FragmentOneBinding


class OneFragment : Fragment() {
    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.button2.setOnClickListener {
            val mainNavController =
                Navigation.findNavController(requireActivity(), R.id.fragmentContainerView)
            mainNavController.navigate(R.id.HomeToLogin)

        }
        return view
    }


}