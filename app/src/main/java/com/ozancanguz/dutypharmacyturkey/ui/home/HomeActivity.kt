package com.ozancanguz.dutypharmacyturkey.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.ozancanguz.dutypharmacyturkey.R
import com.ozancanguz.dutypharmacyturkey.databinding.FragmentHomeActivityBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home_activity.*

@AndroidEntryPoint
class HomeActivity : Fragment() {

    private var _binding: FragmentHomeActivityBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeActivityBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.navigateKKTC.setOnClickListener {
            findNavController().navigate(R.id.action_homeActivity_to_KKTCListFragment)
        }

        binding.navigateturkey.setOnClickListener {
            findNavController().navigate(R.id.action_homeActivity_to_dutyPharmacyList)
        }


        return view




    }


}