package com.example.navigatingapplication.pack3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.navigatingapplication.R
import com.example.navigatingapplication.databinding.FragmentPack3F1Binding

class Pack3F1Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentPack3F1Binding>(inflater, R.layout.fragment_pack3_f1, container, false)

        binding.pack3FragmentButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_pack3F1Fragment_to_pack3F2Fragment)
        }

        return binding.root
    }

}