package com.example.pdv.ui.mainscreen

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pdv.R
import com.example.pdv.databinding.FragmentMainScreenBinding

class MainScreenFragment : Fragment() {

    companion object {
        fun newInstance() = MainScreenFragment()
    }

    private lateinit var viewModel: MainScreenViewModel

    private val binding: FragmentMainScreenBinding by lazy {
        FragmentMainScreenBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)

        return binding.root
    }

    @Deprecated("Deprecated in Java")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.settings_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    @Deprecated("Deprecated in Java")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.print_layout -> {
                findNavController().navigate(R.id.printLayoutFragment)
                true
            }

            R.id.tef_settings -> {
                findNavController().navigate(R.id.tefSettingsFragment)
                true
            }

            R.id.tax_settings -> {
                findNavController().navigate(R.id.taxSettingsFragment)
                true
            }

            R.id.network_settings -> {
                findNavController().navigate(R.id.networkSettingsFragment)
                true
            }

            R.id.about_us -> {
                showAboutDialog()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showAboutDialog() {
        val inflater = LayoutInflater.from(requireContext())
        val dialogLayout: View =
            inflater.inflate(
                R.layout.about_us_dialog_layout,
                requireActivity().findViewById(R.id.print_layout) as ViewGroup?
            )

        val alertDialogBuilder = AlertDialog.Builder(requireContext())

        alertDialogBuilder.setView(dialogLayout)
        alertDialogBuilder.show()
    }
}