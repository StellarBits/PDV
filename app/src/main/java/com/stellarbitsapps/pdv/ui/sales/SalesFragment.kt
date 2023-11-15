package com.stellarbitsapps.pdv.ui.sales

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.stellarbitsapps.pdv.databinding.FragmentSalesBinding
import com.stellarbitsapps.pdv.ui.adapter.ProductsGroupTabsAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.stellarbitsapps.pdv.model.Product
import com.stellarbitsapps.pdv.ui.adapter.ProductsListViewAdapter
import com.stellarbitsapps.pdv.util.MockedData


class SalesFragment : Fragment() {

    private lateinit var viewPager: ViewPager2

    private lateinit var tabLayout: TabLayout

    private lateinit var adapter: ProductsGroupTabsAdapter

    private lateinit var productsListView: ListView

    private lateinit var productsListViewAdapter: ProductsListViewAdapter

    private var listOfItems = mutableListOf<Product>()

    private var totalValue = 0f

    private var groups = MockedData.groups

    private var products = MockedData.products

    companion object {
        fun newInstance() = SalesFragment()

        fun updateProductsListView(salesFragment: SalesFragment, item: Product) {
            salesFragment.updateListView(item)
        }
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

        initTabLayout()
        initListView()

        return binding.root
    }

    private fun initTabLayout() {
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
    }

    @SuppressLint("SetTextI18n")
    private fun initListView() {
        // TODO Temp code. Remove or adjust later.
        productsListViewAdapter = ProductsListViewAdapter(requireContext(), listOfItems)

        productsListView = binding.lvProducts
        productsListView.adapter = productsListViewAdapter

        productsListView.setOnItemClickListener { _, _, position, _ ->

            totalValue -= listOfItems[position].price
            binding.tvTotal.text = "R$ ${"%.2f".format(totalValue)}"

            if (listOfItems[position].saleQuantity == 1) {
                listOfItems.removeAt(position)
            } else {
                listOfItems[position].totalPriceOfQuantitySold -= listOfItems[position].price
                listOfItems[position].saleQuantity -= 1
            }

            productsListViewAdapter.notifyDataSetChanged()
        }
    }

    @SuppressLint("SetTextI18n")
    fun updateListView(item: Product) {
        val productItem = item.copy()

        if (listOfItems.any { it.id == item.id }) {
            val position = listOfItems.indexOfFirst { it.id == item.id }

            val newPrice = listOfItems.filter {
                it.id == item.id
            }[0].totalPriceOfQuantitySold + item.price

            val newQuantity = listOfItems.filter {
                it.id == item.id
            }[0].saleQuantity + 1

            productItem.totalPriceOfQuantitySold = newPrice
            productItem.saleQuantity = newQuantity

            listOfItems[position] = productItem

        } else {
            productItem.totalPriceOfQuantitySold = productItem.price
            productItem.saleQuantity = 1
            listOfItems.add(productItem)
        }

        productsListViewAdapter.notifyDataSetChanged()
        val lastPosition = productsListViewAdapter.count - 1
        productsListView.smoothScrollToPosition(lastPosition)

        totalValue += productItem.price
        binding.tvTotal.text = "R$ ${String.format("%.2f", totalValue)}"
    }
}