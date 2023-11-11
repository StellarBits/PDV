package com.stellarbitsapps.pdv.ui.sales

import android.animation.ValueAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import android.view.animation.DecelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.stellarbitsapps.pdv.databinding.FragmentSalesBinding
import com.stellarbitsapps.pdv.ui.adapter.ProductsGroupTabsAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.stellarbitsapps.pdv.util.MockedData

class SalesFragment : Fragment() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    private lateinit var adapter: ProductsGroupTabsAdapter

    private var groups = MockedData.groups

    private var products = MockedData.products

    companion object {
        fun newInstance() = SalesFragment()
    }

    private lateinit var viewModel: SalesViewModel

    private val binding: FragmentSalesBinding by lazy {
        FragmentSalesBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val appBar = (activity as? AppCompatActivity)?.supportActionBar
        appBar?.hide()

        // TODO Improve tab performance.
        adapter = ProductsGroupTabsAdapter(this, groups, products)
        viewPager = binding.viewpager2
        tabLayout = binding.tablayout

        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = groups[position].name

            val tabColor = resources.getColor(groups[position].color, null)
            tab.view.setBackgroundColor(tabColor)
        }.attach()

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) { }

            override fun onTabReselected(tab: TabLayout.Tab) { }
        })

        for (i in 0 until tabLayout.tabCount) {
            val tab = (tabLayout.getChildAt(0) as ViewGroup).getChildAt(i)
            val p = tab.layoutParams as MarginLayoutParams
            p.setMargins(0, 0, 30, 10)
            tab.requestLayout()
        }

        return binding.root
    }
}