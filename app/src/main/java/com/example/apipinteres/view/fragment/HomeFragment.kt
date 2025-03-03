package com.example.apipinteres.view.fragment

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.apipinteres.databinding.FragmentHomeBinding
import com.example.apipinteres.view.adapter.HomeAdapter
import com.example.apipinteres.view.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val adapter = HomeAdapter()

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        intsiolaze()
    }

    private fun intsiolaze() {
        viewModel.getImages("49142423-5da4f1a42230b6cfb34f4b392", "car")
        binding.apply {
            recyclerView.adapter = adapter
            viewModel.images.observe(viewLifecycleOwner) {response->
                adapter.submitList(response.hits)
            }
        }
    }
}