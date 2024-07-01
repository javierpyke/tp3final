package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.parcialtp3.R


class IntroFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_intro,container,false)

        val btnNavigate = root.findViewById<Button>(R.id.btnInicio)

        btnNavigate.setOnClickListener{
            findNavController().navigate(IntroFragmentDirections.actionIntroToList())
        }

        return root
    }

}