package com.example.shopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.shopy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        replaceFragment()

        viewBinding.bottomBar.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment()
                R.id.addToCard -> replaceFragment()
                R.id.profile -> replaceFragment()
                R.id.menu -> replaceFragment()
                else -> {

                }
            }
            true
        }
    }
    private fun replaceFragment() {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame, Fragment())
        fragmentTransaction.commit()
    }

}