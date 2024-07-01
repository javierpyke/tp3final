package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.parcialtp3.R
import com.bumptech.glide.Glide
import com.example.parcialtp3.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val title = DetailFragmentArgs.fromBundle(requireArguments()).negocio.name
        val titleTxt = binding.txtNameFoodMarket
        titleTxt.text = title

        DetailFragmentArgs.fromBundle(requireArguments()).negocio.let {
            Glide.with(requireContext())
                .load(it.imageResId)
                .fitCenter()
                .into(binding.imgViewFoodMarket);

        }

        val btnNavigate = root.findViewById<Button>(R.id.btnBackDetails)

        btnNavigate.setOnClickListener{
            findNavController().navigate(DetailFragmentDirections.actionDetailsToList())
        }

        return root
    }


}