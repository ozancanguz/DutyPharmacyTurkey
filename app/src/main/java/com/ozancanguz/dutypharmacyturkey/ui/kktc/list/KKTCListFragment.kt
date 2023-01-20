package com.ozancanguz.dutypharmacyturkey.ui.kktc.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.dutypharmacyturkey.R
import com.ozancanguz.dutypharmacyturkey.data.adapters.KktcAdapter
import com.ozancanguz.dutypharmacyturkey.databinding.FragmentKKTCListBinding
import com.ozancanguz.dutypharmacyturkey.viewmodel.KKTCViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_k_k_t_c_list.*

@AndroidEntryPoint
class KKTCListFragment : Fragment() {

    private var _binding: FragmentKKTCListBinding? = null

    private val binding get() = _binding!!


    private val kktcViewModel:KKTCViewModel by viewModels()
    private var kktcAdapter=KktcAdapter()




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKKTCListBinding.inflate(inflater, container, false)
        val view = binding.root


        // observe data and update ui
        observeKKTCLiveData()

        // set up recyclerview
        setupRv()

        return view
    }

    private fun setupRv() {
        binding.kktcrecyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.kktcrecyclerView.adapter=kktcAdapter
    }

    private fun observeKKTCLiveData() {
        binding.kktcsearchbtn.setOnClickListener {
            kktcProgress.visibility=View.VISIBLE
            var kktcCity=binding.kktcileditText.text.toString()
            kktcViewModel.requestkktcData(kktcCity)
            kktcViewModel.kktcPharmacyList.observe(viewLifecycleOwner, Observer {
                kktcAdapter.setData(it)
                kktcProgress.visibility=View.INVISIBLE
            })


        }
    }


}