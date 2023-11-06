package com.example.pdv.ui.settings.tefsettings

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pdv.R

class TefSettingsFragment : Fragment() {

    companion object {
        fun newInstance() = TefSettingsFragment()
    }

    private lateinit var viewModel: TefSettingsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tef_settings, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TefSettingsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}