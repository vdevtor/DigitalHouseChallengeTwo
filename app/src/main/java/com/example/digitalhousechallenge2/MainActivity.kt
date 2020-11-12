package com.example.digitalhousechallenge2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.FragmentManager
import com.example.digitalhousechallenge2.Fragments.LoginFragment
import com.example.digitalhousechallenge2.Fragments.MainMenuFragment
import com.example.digitalhousechallenge2.Fragments.RegisterFragment

class MainActivity : AppCompatActivity() {
    companion object{
         public lateinit var fm : FragmentManager
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fm = supportFragmentManager

        fm.beginTransaction().add(R.id.fragmentContainer, LoginFragment(), null).commit()


    }


    }

