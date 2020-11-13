package com.example.digitalhousechallenge2.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.digitalhousechallenge2.R
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {
    val fm = fragmentManager
    var bar = true


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle: Bundle
         var actionBar = getActionbar();


            if (!bar){
                actionBar?.title = "DigitalHouse Food"

            }








        view.findViewById<AppCompatButton>(R.id.btnRegister).setOnClickListener(chamaTelaCadastro())
        view.findViewById<AppCompatButton>(R.id.btnLogin).setOnClickListener(chamaMainMenu())
        initComponents()
        getActionbar()



    }

    private fun chamaMainMenu(): View.OnClickListener? = View.OnClickListener {



        var allOkay = true
        if (etEmail.text.toString().isBlank()) {
            etEmail.error = getString(R.string.campo_obrigatorio,
                    getString(R.string.email_completo)
            )
            allOkay = false
        } else {


        }


        if (etSenha.text.toString().isBlank()) {
            etSenha.error = getString(R.string.campo_obrigatorio,
                    getString(R.string.senha_nome)
            )
            allOkay = false
        } else {

        }




        if (allOkay) {
            fragmentManager.apply {
                this?.beginTransaction()?.replace(R.id.fragmentContainer, MainMenuFragment(), null)?.addToBackStack(null)
                        ?.commit()
                bar = false
            }
        }


    }

    private fun initComponents() {


    }


    private fun chamaTelaCadastro(): View.OnClickListener? = View.OnClickListener {
        fragmentManager.apply {
            this?.beginTransaction()?.replace(R.id.fragmentContainer, RegisterFragment(), null)
                    ?.addToBackStack(null)?.commit()
        }
    }
    fun getActionbar() : ActionBar?
    {
        return (activity as AppCompatActivity).supportActionBar
    }
}






