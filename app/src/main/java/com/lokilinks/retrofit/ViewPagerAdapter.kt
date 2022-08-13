package com.lokilinks.retrofit

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.lokilinks.retrofit.sreans.second.SecondFragment
import com.lokilinks.retrofit.sreans.start.StartFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
       return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0-> StartFragment()
            else -> SecondFragment()
        }
    }
}