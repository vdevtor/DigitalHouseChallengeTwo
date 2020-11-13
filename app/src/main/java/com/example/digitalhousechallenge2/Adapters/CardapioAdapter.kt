package com.example.digitalhousechallenge2.Adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.digitalhousechallenge2.Fragments.CardapioFragment
import com.example.digitalhousechallenge2.Fragments.DescricaoItemFragment
import com.example.digitalhousechallenge2.Fragments.MainMenuFragment
import com.example.digitalhousechallenge2.MainActivity
import com.example.digitalhousechallenge2.MainActivity.Companion.fm
import com.example.digitalhousechallenge2.Models.Pratos
import com.example.digitalhousechallenge2.Models.Restaurant
import com.example.digitalhousechallenge2.R
import kotlinx.android.synthetic.main.modelo_de_tela_main_menu.view.*
import kotlinx.android.synthetic.main.modelo_tela_cardapio.view.*
import java.util.zip.Inflater

class CardapioAdapter(
       private val cardapioList : MutableList<Pratos>


): RecyclerView.Adapter<CardapioAdapter.CardapioViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardapioViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.modelo_tela_cardapio,parent,false)
        return CardapioViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cardapioList.size
    }

    override fun onBindViewHolder(holder: CardapioViewHolder, position: Int) {
        Glide.with(holder.itemView.context).load(cardapioList[position].imagePrato).into(holder.imageView)
        holder.txtDescricao.text = cardapioList[position].pratoDescricao

       val restaurant = MainMenuFragment()

        holder.itemView.setOnClickListener {
           val bundle = Bundle()
            bundle.putParcelable("itemCard",cardapioList[position])
            val cardapioItem = DescricaoItemFragment()
           cardapioItem.arguments = bundle
           fm.beginTransaction().replace(R.id.fragmentContainer,cardapioItem,null).addToBackStack(null).commit()
        }




    }
    class CardapioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val imageView : ImageView = itemView.findViewById(R.id.ivItemCardapio)
            val txtDescricao: TextView = itemView.findViewById(R.id.tvDescricaoCardapio)
           // val arrow : ImageView = itemView.findViewById(R.id.arrowTelaPratos)






      }
    }

