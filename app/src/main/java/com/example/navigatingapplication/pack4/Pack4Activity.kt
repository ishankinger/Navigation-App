package com.example.navigatingapplication.pack4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.navigatingapplication.R
import com.example.navigatingapplication.databinding.ActivityPack4Binding
import com.example.navigatingapplication.pack1.Pack1Activity
import com.example.navigatingapplication.pack2.Pack2Activity
import com.example.navigatingapplication.pack3.Pack3Activity
import com.example.navigatingapplication.pack5.Pack5Activity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Pack4Activity : AppCompatActivity() {

    private lateinit var binding : ActivityPack4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_pack4)

        val bottomNavView : BottomNavigationView = binding.bottomNavigationViewPack4
        bottomNavView.selectedItemId = R.id.activities_menuItem4

        bottomNavView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.activities_menuItem1 ->{
                    startActivity(Intent(this, Pack1Activity::class.java))
                    finish()
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
                    return@setOnItemSelectedListener true
                }
                else ->{
                    return@setOnItemSelectedListener false
                }
            }
        }
        binding.buttonPack4.setOnClickListener {
            val intent = Intent(this,Pack5Activity::class.java)
            startActivity(intent)
        }
    }
}