package com.example.phoneshope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.phoneshope.databinding.FragmentMainBinding
import com.example.phoneshope.databinding.FragmentProductdetailsBinding

class ProductdetailsFragment : Fragment() {

    private var binding:FragmentProductdetailsBinding ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductdetailsBinding.inflate(inflater , container ,false)
        val view  = binding?.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
  arguments?.let {
      binding?.imageView!!.setImageResource(it.getInt("image"))
      binding?.phoneName!!.text= it.getString("name").toString()
  }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}