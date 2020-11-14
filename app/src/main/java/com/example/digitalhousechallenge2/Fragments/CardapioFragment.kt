package com.example.digitalhousechallenge2.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.digitalhousechallenge2.Adapters.CardapioAdapter
import com.example.digitalhousechallenge2.MainActivity
import com.example.digitalhousechallenge2.Models.Pratos
import com.example.digitalhousechallenge2.Models.Restaurant
import com.example.digitalhousechallenge2.R
import kotlinx.android.synthetic.main.fragment_cardapio.*


class CardapioFragment : Fragment() {
  var pratos = mutableListOf<Pratos>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cardapio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // populate()
        var actionBar = getActionbar();
        actionBar?.hide()
        val restaurant = arguments?.getParcelable<Restaurant>("codRestaurant")
        Glide.with(view.context).load(restaurant?.imageRestaurant).into(ivMainCardapio)
        view.findViewById<TextView>(R.id.tvNomeRestaurantCardapio).text = restaurant?.nomeRestaurant
        view.findViewById<TextView>(R.id.tvNomeRestaurantCardapio2).text = restaurant?.nomeRestaurant


        view.findViewById<ImageView>(R.id.arrowTelaPratos).setOnClickListener {
            fragmentManager?.apply {
               popBackStack()


            }

        }




        val recycleview = view.findViewById<RecyclerView>(R.id.recycleViewCardapio)
        recycleview.adapter = restaurant?.cardapio?.let { CardapioAdapter(it) }

        recycleview.layoutManager = GridLayoutManager(view.context,2)

    }


    fun getActionbar() : ActionBar?
    {
        return (activity as AppCompatActivity).supportActionBar
    }


}