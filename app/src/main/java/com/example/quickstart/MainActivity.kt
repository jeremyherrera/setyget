package com.example.quickstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    lateinit var toogle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)



        toogle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {


           when(it.itemId){

              R.id.nav_home -> Toast.makeText(applicationContext,"clicked Home",Toast.LENGTH_SHORT).show()
              R.id.nav_message -> Toast.makeText(applicationContext,"clicked Message",Toast.LENGTH_SHORT).show()
              R.id.nav_sync -> Toast.makeText(applicationContext,"clicked Sync",Toast.LENGTH_SHORT).show()
              R.id.nav_trash -> Toast.makeText(applicationContext,"clicked Trash",Toast.LENGTH_SHORT).show()
              R.id.nav_settings -> Toast.makeText(applicationContext,"clicked Settings",Toast.LENGTH_SHORT).show()
              R.id.nav_login -> Toast.makeText(applicationContext,"clicked Login",Toast.LENGTH_SHORT).show()
              R.id.nav_share -> Toast.makeText(applicationContext,"clicked Share",Toast.LENGTH_SHORT).show()
              R.id.nav_rate_us -> Toast.makeText(applicationContext,"clicked Rate us",Toast.LENGTH_SHORT).show()


           }

true


        }

     }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toogle.onOptionsItemSelected(item))

            return true

        return super.onOptionsItemSelected(item)
    }


}















