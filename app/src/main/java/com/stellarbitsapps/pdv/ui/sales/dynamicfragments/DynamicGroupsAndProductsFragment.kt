package com.stellarbitsapps.pdv.ui.sales.dynamicfragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.stellarbitsapps.pdv.databinding.FragmentDynamicGroupsAndProductsBinding
import com.stellarbitsapps.pdv.model.Product
import com.stellarbitsapps.pdv.ui.adapter.ProductAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DynamicGroupsAndProductsFragment : Fragment() {

    companion object {
        private const val ARG_PRODUCTS = "products"

        fun newInstance(products: List<Product>): DynamicGroupsAndProductsFragment {
            val fragment = DynamicGroupsAndProductsFragment()
            val args = Bundle()
            args.putParcelableArrayList(ARG_PRODUCTS, ArrayList(products))
            fragment.arguments = args
            return fragment
        }
    }

    private val binding: FragmentDynamicGroupsAndProductsBinding by lazy {
        FragmentDynamicGroupsAndProductsBinding.inflate(layoutInflater)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val recyclerView = binding.rvProducts

        val productAdapter = ProductAdapter(ArrayList())
        recyclerView.adapter = productAdapter

        arguments?.getParcelableArrayList<Product>(ARG_PRODUCTS)?.let { products ->
            lifecycleScope.launch(Dispatchers.Main) {
                productAdapter.setData(products)
                productAdapter.notifyDataSetChanged()
            }
        }

        return binding.root
    }
}