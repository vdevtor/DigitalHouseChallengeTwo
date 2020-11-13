package com.example.digitalhousechallenge2.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.digitalhousechallenge2.Adapters.MainMenuAdapter
import com.example.digitalhousechallenge2.Models.Pratos
import com.example.digitalhousechallenge2.Models.Restaurant
import com.example.digitalhousechallenge2.R
import kotlinx.android.synthetic.main.fragment_cardapio.*
import kotlinx.android.synthetic.main.fragment_descricao_item.*
import kotlinx.android.synthetic.main.modelo_tela_cardapio.*


class DescricaoItemFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_descricao_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val cardapioItem = arguments?.getParcelable<Pratos>("itemCard")
        Glide.with(view.context).load(cardapioItem?.imagePrato).into(ivDescricaoItem)
        view.findViewById<TextView>(R.id.tvPratoNome).text = cardapioItem?.pratoDescricao
        view.findViewById<TextView>(R.id.tvDescricaoItemC).text = cardapioItem?.pratoDescricaoCompleta
      //view.findViewById<ImageView>(R.id.arrowTelaDescricao).setOnClickListener(backArrow())

    }


    }








