package com.stellarbitsapps.pdv.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.stellarbitsapps.pdv.model.Group
import com.stellarbitsapps.pdv.model.Product
import com.stellarbitsapps.pdv.ui.sales.SalesFragment
import com.stellarbitsapps.pdv.ui.sales.dynamicfragments.DynamicGroupsAndProductsFragment

class ProductsGroupTabsAdapter(
    fragment: SalesFragment,
    private val groups: MutableList<Group>,
    private val products: MutableList<MutableList<Product>>
) :
    FragmentStateAdapter(fragment) {

    private val salesFragment = fragment

    override fun createFragment(position: Int): Fragment {
        val groupId = groups[position].id
        return DynamicGroupsAndProductsFragment.newInstance(products[position].filter { it.groupId == groupId }, salesFragment, groups[position].color)
    }

    override fun getItemCount(): Int {
        return groups.size
    }

}