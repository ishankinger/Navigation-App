package com.example.navigatingapplication.pack2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navigatingapplication.R
import com.example.navigatingapplication.databinding.FragmentPack2F3Menu1Binding

class Pack2F3Menu1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentPack2F3Menu1Binding>(inflater, R.layout.fragment_pack2_f3_menu1, container, false)


        return binding.root
    }
}