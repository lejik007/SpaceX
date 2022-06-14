package com.ci.spx.ui.Launches

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ci.spx.R
import com.ci.spx.databinding.LaunchesFragmentBinding

class LaunchesFragment : Fragment() {

    private lateinit var binding: LaunchesFragmentBinding
    private lateinit var viewModel: LaunchesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LaunchesFragmentBinding.inflate(layoutInflater)


        viewModel = ViewModelProvider(this).get(LaunchesViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.launches_fragment, container, false)
    }
}