package com.example.digitalhousechallenge2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.digitalhousechallenge2.Fragments.CardapioFragment
import com.example.digitalhousechallenge2.Fragments.DescricaoItemFragment
import com.example.digitalhousechallenge2.Fragments.LoginFragment
import com.example.digitalhousechallenge2.Fragments.MainMenuFragment

class MainActivity : AppCompatActivity() {
    val fragmentLogin = LoginFragment()
    val fragmentMainMenu = MainMenuFragment()
    val fragmentCardapio = CardapioFragment()
    val fragmentDescricao = DescricaoItemFragment()
    var active = Fragment()


    companion object{
         public lateinit var fm : FragmentManager
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Digital House Foods"
        fm = supportFragmentManager
        fm.beginTransaction().add(R.id.fragmentContainer, this.fragmentLogin).addToBackStack(null).commit()


    }
    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
            finish()
        }
    }


    }

