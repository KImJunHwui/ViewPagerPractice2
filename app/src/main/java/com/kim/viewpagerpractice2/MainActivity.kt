package com.kim.viewpagerpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.viewpagerpractice2.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mViewPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = mViewPagerAdapter

        viewPager.offscreenPageLimit = 5
    }
}