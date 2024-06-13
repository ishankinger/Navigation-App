package com.example.navigatingapplication.pack1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class Pack1F3TabsAdapter(fragmentManager: FragmentManager, lifecycle : Lifecycle)
    : FragmentStateAdapter(fragmentManager,lifecycle){
    /**
     * Returns the total number of items in the data set held by the adapter.
     * @return The total number of items in this adapter.
     */
    override fun getItemCount(): Int {
        return 3
    }

    /**
     * Provide a new Fragment associated with the specified position.
     * The adapter will be responsible for the Fragment lifecycle:
     *  * The Fragment will be used to display an item.
     *  * The Fragment will be destroyed when it gets too far from the viewport, and its state
     * will be saved. When the item is close to the viewport again, a new Fragment will be
     * requested, and a previously saved state will be used to initialize it.
     *
     * @see ViewPager2.setOffscreenPageLimit
     */
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> Pack1F3Tab1Fragment()
            1 -> Pack1F3Tab2Fragment()
            else -> Pack1F3Tab3Fragment()
        }
    }
}