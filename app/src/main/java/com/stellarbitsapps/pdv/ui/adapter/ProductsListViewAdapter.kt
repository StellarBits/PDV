package com.stellarbitsapps.pdv.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.stellarbitsapps.pdv.databinding.ProductsListviewItemBinding
import com.stellarbitsapps.pdv.model.Product

class ProductsListViewAdapter(private val context: Context, private val products: List<Product>) :
    BaseAdapter() {

    override fun getCount(): Int {
        return products.size
    }

    override fun getItem(position: Int): Any {
        return products[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("SetTextI18n")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding: ProductsListviewItemBinding

        if (convertView == null) {
            val inflater = LayoutInflater.from(context)
            binding = ProductsListviewItemBinding.inflate(inflater, parent, false)
            binding.root.tag = binding
        } else {
            binding = convertView.tag as ProductsListviewItemBinding
        }

        val product = getItem(position) as Product
        binding.tvProductName.text = product.name
        binding.tvProductPrice.text = "R$ ${String.format("%.2f", product.totalPriceOfQuantitySold)}"
        binding.tvProductQuantity.text = "x${product.saleQuantity}"

        return binding.root
    }
}