package com.example.navigatingapplication.pack3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.navigatingapplication.R
import com.example.navigatingapplication.databinding.ActivityPack3Binding
import com.example.navigatingapplication.pack1.Pack1Activity
import com.example.navigatingapplication.pack2.Pack2Activity
import com.example.navigatingapplication.pack4.Pack4Activity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetDialog

class Pack3Activity : AppCompatActivity() {

    private lateinit var binding : ActivityPack3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_pack3)

        val bottomNavView : BottomNavigationView = binding.bottomNavigationViewPack3
        bottomNavView.selectedItemId = R.id.activities_menuItem3

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

        binding.buttonDialogBoxPack3.setOnClickListener {
            val view : View = layoutInflater.inflate(R.layout.bottom_sheet_pack3,null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }
    }
}