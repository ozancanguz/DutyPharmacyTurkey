package com.ozancanguz.dutypharmacyturkey.ui.kktc.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ozancanguz.dutypharmacyturkey.R
import com.ozancanguz.dutypharmacyturkey.databinding.FragmentKktcDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class KktcDetailFragment : Fragment() {

     private var _binding: FragmentKktcDetailBinding? = null

    private val binding get() = _binding!!

    private val args:KktcDetailFragmentArgs by navArgs()




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKktcDetailBinding.inflate(inflater, container, false)
        val view = binding.root


        updateUi()


        return view
    }

    private fun updateUi() {
        var currentKktc=args.currentKKTC
        binding.detailsImage.setImageResource(R.drawable.duty)
        binding.kktcdetailsLce.text="İLCE: " +currentKktc.dist
        binding.kktcdetailsName.text=currentKktc.name +"ECZANESİ"
        binding.kktcdetailsPhone.text="TELEFON: " +currentKktc.phone
        binding.kktcdetailsAdress.text=currentKktc.address
    }


}