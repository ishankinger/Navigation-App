package com.example.navigatingapplication.pack1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navigatingapplication.R
import com.example.navigatingapplication.databinding.FragmentPack1F3Tab3Binding

class Pack1F3Tab3Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentPack1F3Tab3Binding>(inflater, R.layout.fragment_pack1_f3_tab3, container, false)


        return binding.root
    }
}