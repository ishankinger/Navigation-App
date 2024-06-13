package com.example.navigatingapplication.pack1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.navigatingapplication.R
import com.example.navigatingapplication.databinding.FragmentPack1F3Binding
import com.google.android.material.tabs.TabLayout

class Pack1F3Fragment : Fragment() {

    private lateinit var tabLayout : TabLayout
    private lateinit var viewPager2 : ViewPager2
    private lateinit var adapter : Pack1F3TabsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentPack1F3Binding>(inflater, R.layout.fragment_pack1_f3, container, false)

        tabLayout = binding.tabLayoutPack1Fragment3
        viewPager2 = binding.viewPager2Pack1Fragment3
        adapter = Pack1F3TabsAdapter(childFragmentManager,lifecycle)

        tabLayout.addTab(tabLayout.newTab().setText("P1_F3_T1"))
        tabLayout.addTab(tabLayout.newTab().setText("P1_F3_T2"))
        tabLayout.addTab(tabLayout.newTab().setText("P1_F3_T3"))

        viewPager2.adapter = adapter

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            /**
             * Called when a tab enters the selected state.
             * @param tab The tab that was selected
             */
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if(tab != null)
                    viewPager2.currentItem = tab.position
            }

            /**
             * Called when a tab exits the selected state.
             * @param tab The tab that was unselected
             */
            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            /**
             * Called when a tab that is already selected is chosen again by the user. Some applications may
             * use this action to return to the top level of a category.
             * @param tab The tab that was reselected.
             */
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

        viewPager2.registerOnPageChangeCallback(object: OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })

        return binding.root
    }
}