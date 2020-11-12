package com.example.digitalhousechallenge2.Fragments

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousechallenge2.Adapters.MainMenuAdapter
import com.example.digitalhousechallenge2.Models.Restaurant
import com.example.digitalhousechallenge2.R



class MainMenuFragment : Fragment() {
    private var restaurantes = mutableListOf<Restaurant>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populate()

        val recycleview = view.findViewById<RecyclerView>(R.id.recycleMainMenu)
        recycleview.adapter = MainMenuAdapter(restaurantes)
        recycleview.layoutManager = LinearLayoutManager(view.context)


    }


    private fun populate() {
        restaurantes.clear()
        restaurantes.add(Restaurant("https://randomuser.me/api/portraits/women/33.jpg",
                "Tony's Burger", "Av marechal pompozo 555", "Fecha as 18h00"))
        restaurantes.add(Restaurant("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Tony's pizza place", "Av marechal pompozo 555", "Fecha as 18h00"))
        restaurantes.add(Restaurant("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Tony's Burger", "Av marechal pompozo 555", "Fecha as 18h00"))
        restaurantes.add(Restaurant("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Tony's Burger", "Av marechal pompozo 555", "Fecha as 18h00"))
        restaurantes.add(Restaurant("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Tony's Burger", "Av marechal pompozo 555", "Fecha as 18h00"))
        restaurantes.add(Restaurant("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Tony's Burger", "Av marechal pompozo 555", "Fecha as 18h00"))
        restaurantes.add(Restaurant("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Tony's Burger", "Av marechal pompozo 555", "Fecha as 18h00"))
        restaurantes.add(Restaurant("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Tony's Burger", "Av marechal pompozo 555", "Fecha as 18h00"))
        restaurantes.add(Restaurant("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Tony's Burger", "Av marechal pompozo 555", "Fecha as 18h00"))


    }
}
