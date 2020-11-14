package com.example.digitalhousechallenge2.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.digitalhousechallenge2.R
import kotlinx.android.synthetic.main.fragment_register.*


class RegisterFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var actionBar = getActionbar();



            actionBar?.title = "DigitalHouse Food"




        view.findViewById<AppCompatButton>(R.id.btnRegisterDados).setOnClickListener(chamaTelaMainMenu())

    }
    private fun chamaTelaMainMenu(): View.OnClickListener? = View.OnClickListener {
        var allOkay = true
        if (etRegisterNome.text.toString().isBlank()) {
            etRegisterNome.error = getString(R.string.campo_obrigatorio,
                    getString(R.string.nome_completo))
            allOkay = false
        } else {

        }
        if (etRegisterEmail.text.toString().isBlank()) {
            etRegisterEmail.error = getString(R.string.campo_obrigatorio,
                    getString(R.string.email_completo))
            allOkay = false
        } else {

        }
        if (etREgisterSenha.text.toString().isBlank()) {
            etREgisterSenha.error = getString(R.string.campo_obrigatorio,
                    getString(R.string.senhaLogin))
            allOkay = false
        } else {

        }

        if (etConfirmaSenha.text.toString().isBlank()) {
            etConfirmaSenha.error = getString(R.string.campo_obrigatorio,
                    getString(R.string.confirma_senha))
            allOkay = false
        } else {

        }

        if (allOkay) {
            fragmentManager.apply {
                this?.beginTransaction()?.replace(R.id.fragmentContainer, MainMenuFragment(), null)?.addToBackStack(null)?.commit()


            }
        }
    }
    fun getActionbar() : ActionBar?
    {
        return (activity as AppCompatActivity).supportActionBar
    }
}

