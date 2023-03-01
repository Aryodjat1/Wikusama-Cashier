package com.wikusama.kasir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.wikusama.kasir.cashier.history.History_Fragment
import com.wikusama.kasir.cashier.home.Home_Fragment
import com.wikusama.kasir.cashier.status.Status_Fragment
import com.wikusama.kasir.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home_Fragment())

        binding.navCashierView.setOnItemSelectedListener{

            when(it.itemId){

                R.id.navigation_home -> replaceFragment(Home_Fragment())
                R.id.navigation_status -> replaceFragment(Status_Fragment())
                R.id.navigation_history -> replaceFragment(History_Fragment())

                else ->{

                }
            }
            true
        }
    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.nav_cashier_fragment, fragment)
        fragmentTransaction.commit()
    }
}