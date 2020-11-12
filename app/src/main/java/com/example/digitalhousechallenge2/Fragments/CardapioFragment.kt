package com.example.digitalhousechallenge2.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousechallenge2.Adapters.CardapioAdapter
import com.example.digitalhousechallenge2.Adapters.MainMenuAdapter
import com.example.digitalhousechallenge2.Models.Pratos
import com.example.digitalhousechallenge2.Models.Restaurant
import com.example.digitalhousechallenge2.R
import kotlinx.android.synthetic.main.fragment_cardapio.*


class CardapioFragment : Fragment() {
    private var pratos = mutableListOf<Pratos>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cardapio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populate()

        val recycleview = view.findViewById<RecyclerView>(R.id.recycleViewCardapio)
        recycleview.adapter = CardapioAdapter(pratos)
        recycleview.layoutManager = LinearLayoutManager(view.context)

    }

    private fun populate() {
        pratos.clear()
      pratos.add(Pratos(
                "https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "https://randomuser.me/api/portraits/women/33.jpg",
                "Salada de fruta com coberto extra"))
        pratos.add(Pratos(
                "https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Salada de fruta com coberto extra"))

        pratos.add(Pratos(
                "https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Salada de fruta com coberto extra"))





    }
}