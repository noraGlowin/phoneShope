package com.example.phoneshope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.adapter.ItemAdapter
import com.example.phoneshope.data.Datasource
import com.example.phoneshope.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var binding: FragmentMainBinding? = null
    private lateinit var recyclerView: RecyclerView
    val dataSet =Datasource().loadMyShopData()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding?.recyclerView!!
        recyclerView.adapter= ItemAdapter(dataSet ,requireContext())
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}