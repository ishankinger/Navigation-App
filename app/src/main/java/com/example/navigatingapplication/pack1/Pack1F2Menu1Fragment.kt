package com.example.navigatingapplication.pack1

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.navigatingapplication.R
import com.example.navigatingapplication.databinding.FragmentPack1F2Menu1Binding


class Pack1F2Menu1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentPack1F2Menu1Binding>(inflater, R.layout.fragment_pack1_f2_menu1, container, false)


        return binding.root
    }

}