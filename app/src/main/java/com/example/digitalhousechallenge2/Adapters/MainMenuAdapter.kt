package com.example.digitalhousechallenge2.Adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.digitalhousechallenge2.Fragments.CardapioFragment
import com.example.digitalhousechallenge2.MainActivity.Companion.fm
import com.example.digitalhousechallenge2.Models.Restaurant
import com.example.digitalhousechallenge2.R

class MainMenuAdapter(
        private val restaurantList: List<Restaurant>
): RecyclerView.Adapter<MainMenuAdapter.RestaurantViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.modelo_de_tela_main_menu,parent,false)

    return RestaurantViewHolder(view)
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        Glide.with(holder.itemView.context).load(restaurantList[position].imageRestaurant).into(holder.imageView)
        holder.txtName.text = restaurantList[position].nomeRestaurant
        holder.txtEndereco.text = restaurantList[position].locationRestaurant
        holder.txtFuncionamento.text = restaurantList[position].closeAt

        holder.itemView.setOnClickListener {

           fm.beginTransaction().replace(R.id.fragmentContainer,CardapioFragment(),null).addToBackStack(null).commit()


        }


    }

    class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivMainMenu)
        val txtName: TextView = itemView.findViewById(R.id.tvNomeRestaurant)
        val txtEndereco: TextView = itemView.findViewById(R.id.tvEndereco)
        val txtFuncionamento: TextView = itemView.findViewById(R.id.tvFuncionamento)



    }
}