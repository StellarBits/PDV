package com.stellarbitsapps.pdv.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.stellarbitsapps.pdv.model.Group
import com.stellarbitsapps.pdv.model.Product
import com.stellarbitsapps.pdv.ui.sales.dynamicfragments.DynamicGroupsAndProductsFragment

class ProductsGroupTabsAdapter(
    fragment: Fragment,
    private val groups: MutableList<Group>,
    private val products: MutableList<MutableList<Product>>
) :
    FragmentStateAdapter(fragment) {

    override fun createFragment(position: Int): Fragment {
        val groupId = groups[position].id
        return DynamicGroupsAndProductsFragment.newInstance(products[position].filter { it.groupId == groupId })
    }

    override fun getItemCount(): Int {
        return groups.size
    }

}