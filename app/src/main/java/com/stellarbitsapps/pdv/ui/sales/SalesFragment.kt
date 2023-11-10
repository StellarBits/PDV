package com.stellarbitsapps.pdv.ui.sales

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.stellarbitsapps.pdv.databinding.FragmentSalesBinding
import com.stellarbitsapps.pdv.ui.adapter.ProductsGroupTabsAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.random.Random

class SalesFragment : Fragment() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    private lateinit var adapter: ProductsGroupTabsAdapter

    var data = listOf("Lista de produtos do grupo 'Bebidas'",
        "Lista de produtos do grupo 'Carnes'",
        "Lista de produtos do grupo 'Doces'",
        "Lista de produtos do grupo 'Bebidas'",
        "Lista de produtos do grupo 'Carnes'",
        "Lista de produtos do grupo 'Doces'",
        "Lista de produtos do grupo 'Bebidas'",
        "Lista de produtos do grupo 'Carnes'",
        "Lista de produtos do grupo 'Doces'"
    )

    var tabs = listOf("Bebidas", "Carnes", "Doces", "Bebidas", "Carnes", "Doces", "Bebidas", "Carnes", "Doces")

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

        adapter = ProductsGroupTabsAdapter(this, data)
        viewPager = binding.viewpager2
        tabLayout = binding.tablayout

        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tabs[position]

            // TODO Replace code bellow to color got from API
            val randomColor = Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            tab.view.setBackgroundColor(randomColor)
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