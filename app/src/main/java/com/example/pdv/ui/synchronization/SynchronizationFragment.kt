package com.example.pdv.ui.synchronization

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pdv.R

class SynchronizationFragment : Fragment() {

    companion object {
        fun newInstance() = SynchronizationFragment()
    }

    private lateinit var viewModel: SynchronizationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_synchronization, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SynchronizationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}