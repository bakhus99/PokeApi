package com.bakhus.pokeapi.ui.searchPokeScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.bakhus.pokeapi.R

class SearchPokeFragment : Fragment() {


    private val viewModel: SearchPokeViewModel by viewModels ()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.search_poki_fragment, container, false)
    }



}