package com.example.navigatingapplication.pack1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.navigatingapplication.R
import com.example.navigatingapplication.databinding.ActivityPack1Binding
import com.example.navigatingapplication.pack2.Pack2Activity
import com.example.navigatingapplication.pack3.Pack3Activity
import com.example.navigatingapplication.pack4.Pack4Activity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Pack1Activity : AppCompatActivity() {

    private lateinit var binding : ActivityPack1Binding
    private lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_pack1)

        val bottomNavView : BottomNavigationView = binding.bottomNavigationViewPack1
        bottomNavView.selectedItemId = R.id.activities_menuItem1

        bottomNavView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.activities_menuItem1 ->{
                    return@setOnItemSelectedListener true
                }
                R.id.activities_menuItem2 ->{
                    startActivity(Intent(this, Pack2Activity::class.java))
                    finish()
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


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerPack1) as NavHostFragment
        navController = navHostFragment.navController

        val bottomNavigationView = binding.bottomNavigationViewPack1Fragments
        setupWithNavController(bottomNavigationView,navController)
    }
}