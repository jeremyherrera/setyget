package com.example.quickstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.quickstart.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.Tab

class MainActivity : AppCompatActivity() {

        private lateinit var biding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(biding.root)
        replaceFragment(Home())


        biding.bottomNavigationView.setOnItemSelectedListener {

        when(it.itemId){

                R.id.home -> replaceFragment(Home())
                R.id.profile -> replaceFragment(Profile())
                R.id.settings -> replaceFragment(settings())

          else ->{

          }

        }
        true

    }




  }

       private fun replaceFragment(fragment: Fragment){

           val fragmentManager = supportFragmentManager
           val fragmentTransaction = fragmentManager.beginTransaction()
           fragmentTransaction.replace(R.id.frame_layout,fragment)
           fragmentTransaction.commit()


       }


}















