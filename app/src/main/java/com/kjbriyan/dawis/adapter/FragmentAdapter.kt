package com.kjbriyan.dawis.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

//fragment ambil dari tutorial youtube Android TabLayout Tutorial using ViewPager and Fragments In Kotlin
class FragmentAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    var mfm = fm
    var mFragmentItems:ArrayList<Fragment> = ArrayList()
    var mFragmentTitles:ArrayList<String> = ArrayList()

    //function
    fun addFragments(fragmentItem: Fragment, fragmentTitle: String){
        mFragmentItems.add(fragmentItem)
        mFragmentTitles.add(fragmentTitle)
    }
    override fun getItem(p0: Int): Fragment {
        return mFragmentItems[p0]
    }

    override fun getCount(): Int {
        return mFragmentItems.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitles[position]
    }
}