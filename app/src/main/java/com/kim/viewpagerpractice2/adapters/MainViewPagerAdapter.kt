package com.kim.viewpagerpractice2.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kim.viewpagerpractice2.fragments.AddressFragment
import com.kim.viewpagerpractice2.fragments.AgeFragment
import com.kim.viewpagerpractice2.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {

        return 3
    }

    override fun getItem(position: Int): Fragment {

        if(position == 0){

            return NameFragment()
        }

        else if(position == 1){

            return AgeFragment()
        }

        else{

            return AddressFragment()
        }

    }



}