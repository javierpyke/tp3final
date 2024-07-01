package com.example.parcialtp3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavView : BottomNavigationView
    private lateinit var navHostFragment : NavHostFragment
    private lateinit var floatingBtn : FloatingActionButton



    private val fragmentsNavigation = setOf(
        R.id.list,
        R.id.details,
        R.id.intro,
        R.id.historico
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment

        bottomNavView = findViewById(R.id.bottomNavView)

        NavigationUI.setupWithNavController(bottomNavView, navHostFragment.navController)

        floatingBtn = findViewById(R.id.fab)


        navHostFragment.navController.addOnDestinationChangedListener { _, destination: NavDestination, _ ->
            when (destination.id) {
                R.id.list,
                R.id.details,
                R.id.historico
                -> {
                    bottomNavView.visibility = BottomNavigationView.VISIBLE
                    floatingBtn.visibility = FloatingActionButton.VISIBLE
                }
                else -> {
                    bottomNavView.visibility = BottomNavigationView.GONE
                    floatingBtn.visibility = FloatingActionButton.GONE
                }
            }
        }
    }
}