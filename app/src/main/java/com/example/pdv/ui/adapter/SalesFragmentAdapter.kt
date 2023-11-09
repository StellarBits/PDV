package com.example.pdv.ui.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.pdv.ui.sales.dynamicfragments.DynamicGroupsAndProductsFragment

class SalesFragmentAdapter(fragment: Fragment, private val tabs: List<String>) :
    FragmentStateAdapter(fragment) {

    override fun createFragment(position: Int): Fragment {
        val fragment = DynamicGroupsAndProductsFragment()
        val bundle = Bundle()
        bundle.putString("key", tabs[position])
        fragment.arguments = bundle
        return fragment
    }

    override fun getItemCount(): Int {
        return tabs.size
    }

}