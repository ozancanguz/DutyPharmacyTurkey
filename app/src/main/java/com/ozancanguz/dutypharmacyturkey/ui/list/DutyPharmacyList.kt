package com.ozancanguz.dutypharmacyturkey.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.dutypharmacyturkey.R
import com.ozancanguz.dutypharmacyturkey.databinding.FragmentDutyPharmacyListBinding


class DutyPharmacyList : Fragment() {
    private var _binding: FragmentDutyPharmacyListBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDutyPharmacyListBinding.inflate(inflater, container, false)
        val view = binding.root



        return view
    }


}