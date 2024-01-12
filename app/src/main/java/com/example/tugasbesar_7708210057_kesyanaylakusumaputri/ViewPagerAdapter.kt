package com.example.tugasbesar_7708210057_kesyanaylakusumaputri

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
    return   when(position){
            0->{
                FirstFragment()
            }
            1->{
                SecFragment()
            }
            else->{
                Fragment()
            }
        }
    }
}