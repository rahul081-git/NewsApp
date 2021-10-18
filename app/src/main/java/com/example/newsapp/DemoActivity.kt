package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_demo.*

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(),"Headlines")
        adapter.addFragment(SportsFragment(),"Sports")
        adapter.addFragment(BusinessFragment(),"Business")
        adapter.addFragment(EntertainmentFragment(),"Entertainment")
        adapter.addFragment(HealthFragment(),"Health")

        view_pager.adapter = adapter
        tab_layout.setupWithViewPager(view_pager)

    }
}