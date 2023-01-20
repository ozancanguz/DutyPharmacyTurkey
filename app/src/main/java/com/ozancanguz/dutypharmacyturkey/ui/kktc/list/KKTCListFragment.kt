package com.ozancanguz.dutypharmacyturkey.ui.kktc.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.dutypharmacyturkey.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class KKTCListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_k_k_t_c_list, container, false)
    }


}