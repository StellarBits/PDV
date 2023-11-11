package com.stellarbitsapps.pdv.ui.settings.networksettings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stellarbitsapps.pdv.R

class NetworkSettingsFragment : Fragment() {

    companion object {
        fun newInstance() = NetworkSettingsFragment()
    }

    private lateinit var viewModel: NetworkSettingsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_network_settings, container, false)
    }

}