package com.stellarbitsapps.pdv.ui.settings.printlayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stellarbitsapps.pdv.R

class PrintLayoutFragment : Fragment() {

    companion object {
        fun newInstance() = PrintLayoutFragment()
    }

    private lateinit var viewModel: PrintLayoutViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_print_layout, container, false)
    }

}