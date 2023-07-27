package com.example.foody.activites


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.foody.R


import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //setting up navigation controller
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.btm_nav)
        val navController = findNavController(this, R.id.host_fragment)

        NavigationUI.setupWithNavController(bottomNavigation,navController)

    }
}