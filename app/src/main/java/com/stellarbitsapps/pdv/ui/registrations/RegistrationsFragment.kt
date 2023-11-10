package com.stellarbitsapps.pdv.ui.registrations

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stellarbitsapps.pdv.R

class RegistrationsFragment : Fragment() {

    companion object {
        fun newInstance() = RegistrationsFragment()
    }

    private lateinit var viewModel: RegistrationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_registrations, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegistrationsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}