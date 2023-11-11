package com.stellarbitsapps.pdv.ui.settings.tefsettings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stellarbitsapps.pdv.R

class TefSettingsFragment : Fragment() {

    companion object {
        fun newInstance() = TefSettingsFragment()
    }

    private lateinit var viewModel: TefSettingsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tef_settings, container, false)
    }

}