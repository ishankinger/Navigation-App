package com.example.navigatingapplication.pack1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navigatingapplication.R
import com.example.navigatingapplication.databinding.FragmentPack1F1Menu2Binding

class Pack1F1Menu2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentPack1F1Menu2Binding>(inflater, R.layout.fragment_pack1_f1_menu2, container, false)


        return binding.root
    }
}