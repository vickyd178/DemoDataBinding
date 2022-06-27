package com.doops.demodatabinding

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.widget.NestedScrollView
import com.doops.demodatabinding.databinding.ActivityMainBinding
import com.doops.demodatabinding.utils.enableAutoFabShrink
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this
        //set fab to expand/shrink on nestedScroll
        binding.nestedScroll.enableAutoFabShrink(binding.fab)

    }
}

