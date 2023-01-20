package com.ozancanguz.dutypharmacyturkey.ui.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.dutypharmacyturkey.R
import com.ozancanguz.dutypharmacyturkey.data.adapters.PharmacyAdapter
import com.ozancanguz.dutypharmacyturkey.databinding.FragmentDutyPharmacyListBinding
import com.ozancanguz.dutypharmacyturkey.viewmodel.DutyPharmacyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DutyPharmacyList : Fragment() {
    private var _binding: FragmentDutyPharmacyListBinding? = null
    private val binding get() = _binding!!

    private val dutyPharmacyViewModel:DutyPharmacyViewModel by viewModels()
    private val pharmacyAdapter=PharmacyAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDutyPharmacyListBinding.inflate(inflater, container, false)
        val view = binding.root


        // set up rv
        setupRv()

        // observe data and update ui
        observeLiveData()


        return view
    }

    private fun observeLiveData() {
        binding.searchbtn.setOnClickListener {
            binding.progress.visibility=View.VISIBLE
            val il=binding.ileditText.text.toString()
            dutyPharmacyViewModel.requestApiData(il)
            dutyPharmacyViewModel.dutyPharmacyList.observe(viewLifecycleOwner, Observer {
                pharmacyAdapter.setData(it)
                binding.progress.visibility=View.INVISIBLE
            })
        }

    }

    private fun setupRv() {
        binding.recyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.recyclerView.adapter=pharmacyAdapter
    }


}