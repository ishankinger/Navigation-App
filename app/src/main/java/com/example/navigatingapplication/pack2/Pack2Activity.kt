package com.example.navigatingapplication.pack2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigatingapplication.R
import com.example.navigatingapplication.databinding.ActivityPack2Binding
import com.example.navigatingapplication.pack1.Pack1Activity
import com.example.navigatingapplication.pack3.Pack3Activity
import com.example.navigatingapplication.pack4.Pack4Activity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Pack2Activity : AppCompatActivity() {

    private lateinit var binding : ActivityPack2Binding
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_pack2)

        val bottomNavView : BottomNavigationView = binding.bottomNavigationViewPack2
        bottomNavView.selectedItemId = R.id.activities_menuItem2

        bottomNavView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.activities_menuItem1 ->{
                    startActivity(Intent(this, Pack1Activity::class.java))
                    finish()
                    return@setOnItemSelectedListener true
                }
                R.id.activities_menuItem2 ->{
                    return@setOnItemSelectedListener true
                }
                R.id.activities_menuItem3 ->{
                    startActivity(Intent(this, Pack3Activity::class.java))
                    finish()
                    return@setOnItemSelectedListener true
                }
                R.id.activities_menuItem4 ->{
                    startActivity(Intent(this, Pack4Activity::class.java))
                    finish()
                    return@setOnItemSelectedListener true
                }
                else ->{
                    return@setOnItemSelectedListener false
                }
            }
        }

        drawerLayout = binding.drawerLayoutPack2

        val navController = this.findNavController(R.id.fragmentContainerPack2)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        NavigationUI.setupWithNavController(binding.navViewPack2, navController)

        navController.addOnDestinationChangedListener { nc: NavController, nd: NavDestination, args: Bundle? ->
            if (nd.id == nc.graph.startDestinationId) {
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            } else {
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.fragmentContainerPack2)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }

}