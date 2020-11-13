package com.example.digitalhousechallenge2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.digitalhousechallenge2.Fragments.*

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
        //supportActionBar?.title = "Digital House Foods"
        fm = supportFragmentManager
        fm.beginTransaction().add(R.id.fragmentContainer, LoginFragment(), "1").commit()








    }


    }

