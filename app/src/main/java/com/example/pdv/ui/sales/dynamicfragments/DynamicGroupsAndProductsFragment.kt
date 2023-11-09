package com.example.pdv.ui.sales.dynamicfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pdv.databinding.FragmentDynamicGroupsAndProductsBinding
import com.example.pdv.ui.sales.SalesFragment

class DynamicGroupsAndProductsFragment : Fragment() {

    companion object {
        fun newInstance() = SalesFragment()
    }

    private val binding: FragmentDynamicGroupsAndProductsBinding by lazy {
        FragmentDynamicGroupsAndProductsBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val bundle = arguments
        binding.tvText.text = bundle!!.getString("key")

        return binding.root
    }
}