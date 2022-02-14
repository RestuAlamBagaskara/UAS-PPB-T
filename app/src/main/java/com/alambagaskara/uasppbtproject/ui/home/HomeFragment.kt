package com.alambagaskara.uasppbtproject.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.alambagaskara.uasppbtproject.*
import com.alambagaskara.uasppbtproject.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.makanan.setOnClickListener {
            startActivity(Intent(context, Makanan::class.java))
        }

        binding.ibuAnak.setOnClickListener {
            startActivity(Intent(context, IbuAnak::class.java))
        }

        binding.kesehatan.setOnClickListener {
            startActivity(Intent(context, Kesehatan::class.java))
        }

        binding.rumah.setOnClickListener {
            startActivity(Intent(context, RumahDapur::class.java))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}