package com.example.pdv.ui.settings.taxsettings

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pdv.R

class TaxSettingsFragment : Fragment() {

    companion object {
        fun newInstance() = TaxSettingsFragment()
    }

    private lateinit var viewModel: TaxSettingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tax_settings, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TaxSettingsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}