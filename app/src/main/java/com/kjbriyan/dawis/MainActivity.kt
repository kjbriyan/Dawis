package com.kjbriyan.dawis

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.kjbriyan.dawis.adapter.FragmentAdapter
import com.kjbriyan.dawis.fragment.FormTpPkk
import com.kjbriyan.dawis.fragment.Industri
import com.kjbriyan.dawis.fragment.KegiatanWarga
import com.kjbriyan.dawis.fragment.Pekarangan
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var menuItem: Menu? = null
    private var fmAdapter: FragmentAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fmAdapter = FragmentAdapter(supportFragmentManager)
        with(fmAdapter) {
            this?.addFragments(FormTpPkk(), "Form Tp Pkk")
            this?.addFragments(KegiatanWarga(), "Form Kegiatan Warga")
            this?.addFragments(Industri(), "Form Industri")
            this?.addFragments(Pekarangan(), "Form Pekarangan")

        }
        viewFragment.adapter = fmAdapter
        tabLayout.setupWithViewPager(viewFragment)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        menuItem = menu
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.login -> {
                login()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun login() {
        val intent = Intent(this, LoginActivty::class.java)
        startActivity(intent)
    }
}
