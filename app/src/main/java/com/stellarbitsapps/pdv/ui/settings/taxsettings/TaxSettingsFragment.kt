package com.stellarbitsapps.pdv.ui.settings.taxsettings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stellarbitsapps.pdv.R

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

}