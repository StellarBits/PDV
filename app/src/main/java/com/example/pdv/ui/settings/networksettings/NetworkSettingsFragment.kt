package com.example.pdv.ui.settings.networksettings

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pdv.R

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

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NetworkSettingsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}