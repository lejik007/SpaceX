package com.ci.spx.ui

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.ci.spx.R
import com.ci.spx.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this, R.id.main_graph)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        return super.onCreateView(name, context, attrs)
    }
}