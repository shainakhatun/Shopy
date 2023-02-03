package com.example.shopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.shopy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_splash)
        setContentView(R.layout.fragment_home)
        setContentView(R.layout.fragment_menu)
        setContentView(R.layout.fragment_person)
        setContentView(R.layout.fragment_add_to_card)

        viewBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        replaceFragment(HomeFragment())

        viewBinding.bottomBar.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.person -> replaceFragment(PersonFragment())
                R.id.addToCard -> replaceFragment(AddToCardFragment())
                R.id.menu -> replaceFragment(MenuFragment())
                else -> {

                }
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame,fragment)
        fragmentTransaction.commit()
    }

}