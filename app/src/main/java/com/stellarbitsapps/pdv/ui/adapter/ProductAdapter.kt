package com.stellarbitsapps.pdv.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stellarbitsapps.pdv.databinding.ProductsItemBinding
import com.stellarbitsapps.pdv.model.Product
import com.stellarbitsapps.pdv.ui.sales.dynamicfragments.DynamicGroupsAndProductsFragment

class ProductAdapter(
    private val products: MutableList<Product>,
    private val dynamicGroupsAndProductsFragment: DynamicGroupsAndProductsFragment
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(private val binding: ProductsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(product: Product, dynamicGroupsAndProductsFragment: DynamicGroupsAndProductsFragment) {
            binding.product = product

            with(binding) {
                executePendingBindings()
            }

            binding.btProduct.setOnClickListener {
                dynamicGroupsAndProductsFragment.productClicked(product)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding =
            ProductsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.bind(product, dynamicGroupsAndProductsFragment)
    }

    override fun getItemCount(): Int {
        return products.size
    }

    fun setData(newProducts: List<Product>) {
        products.clear()
        products.addAll(newProducts)
    }
}