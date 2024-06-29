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
import com.example.parcialtp3.databinding.FragmentProfileBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "txtTitleBestDestination"
private const val ARG_PARAM2 = "imgViewBackgroundBestDestination"

/**
 * A simple [Fragment] subclass.
 * Use the [Profile.newInstance] factory method to
 * create an instance of this fragment.
 */
class Profile : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val title = ProfileArgs.fromBundle(requireArguments()).negocio.title
        val titleTxt = binding.txtTitleBestDestination
        titleTxt.text = title

        ProfileArgs.fromBundle(requireArguments()).negocio.let {
            Glide.with(requireContext())
                .load(it.imageResId)
                .fitCenter()
                .into(binding.imgViewBackgroundBestDestination);

        }

        val btnNavigate = root.findViewById<Button>(R.id.btnBackBestDestination)

        btnNavigate.setOnClickListener{
            findNavController().navigate(ProfileDirections.actionProfileToExplore())
        }

        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Profile.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Profile().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}