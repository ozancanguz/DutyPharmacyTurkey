package com.ozancanguz.dutypharmacyturkey.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ozancanguz.dutypharmacyturkey.R
import com.ozancanguz.dutypharmacyturkey.databinding.FragmentDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null

    private val binding get() = _binding!!

    private val args:DetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        val view = binding.root



        updateUi()

        return view

    }

    private fun updateUi() {
        var currentPharmacy=args.currentPharmacy
        binding.detailsImage.setImageResource(R.drawable.duty)
        binding.detailsName.text=currentPharmacy.name
        binding.detailsAdress.text=currentPharmacy.address
        binding.detailsLce.text=currentPharmacy.dist
        binding.detailsPhone.text="Phone: " +currentPharmacy.phone
    }


}