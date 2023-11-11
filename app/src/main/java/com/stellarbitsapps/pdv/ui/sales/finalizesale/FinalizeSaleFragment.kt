package com.stellarbitsapps.pdv.ui.sales.finalizesale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stellarbitsapps.pdv.R

class FinalizeSaleFragment : Fragment() {

    companion object {
        fun newInstance() = FinalizeSaleFragment()
    }

    private lateinit var viewModel: FinalizeSaleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_finalize_sale, container, false)
    }

}