package com.example.digitalhousechallenge2.Fragments

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousechallenge2.Adapters.MainMenuAdapter
import com.example.digitalhousechallenge2.Models.Pratos
import com.example.digitalhousechallenge2.Models.Restaurant
import com.example.digitalhousechallenge2.R


class MainMenuFragment : Fragment() {


    private var restaurantes = mutableListOf<Restaurant>()
    private var cardapio = CardapioFragment()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_menu, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populate()
        initComponents()



        val recycleview = view.findViewById<RecyclerView>(R.id.recycleMainMenu)
        recycleview.adapter = MainMenuAdapter(restaurantes)
        recycleview.layoutManager = LinearLayoutManager(view.context)


    }

    private fun populate() {
        restaurantes.clear()
        restaurantes.add(Restaurant("https://blog.novasafra.com.br/wp-content/uploads/2018/03/comida-arabe-780x450.jpg",
                "La bevitta",
                "Av marechal pompozo 555",
                "Fecha as 18h00",
                mutableListOf<Pratos>(Pratos("https://images.media-allrecipes.com/images/74681.jpg",
                        "macarrão integral, com camarões","Nosso macarrão tem um toque especial do Renomado chefe Gustavo Fraldine,Sendo considerado sua 'Obra Prima',o prato é composto por: Macarrão na manteiga, maionese caseira, tempero especial e vem com os mais frescos camarões"+
                        "selecionados a dedo"),  Pratos("https://images.media-allrecipes.com/images/74681.jpg",
                        "macarrão integral, com camarões","Nosso macarrão tem um toque especial do Renomado chefe Gustavo Fraldine" +
                        ",Sendo considerado sua 'Obra Prima', o prato é composto por : Macarrão na manteiga, maionese caseira, tempero especial e vem com os mais frescos camarões" +
                        "selecionados a dedo") , Pratos("https://images.media-allrecipes.com/images/74681.jpg",
                        "macarrão integral, com camarões","Nosso macarrão tem um toque especial do Renomado chefe Gustavo Fraldine" +
                        ",Sendo considerado sua 'Obra Prima', o prato é composto por : Macarrão na manteiga, maionese caseira, tempero especial e vem com os mais frescos camarões" +
                        "selecionados a dedo"),  Pratos("https://images.media-allrecipes.com/images/74681.jpg",
                        "macarrão integral, com camarões","Nosso macarrão tem um toque especial do Renomado chefe Gustavo Fraldine" +
                        ",Sendo considerado sua 'Obra Prima', o prato é composto por : Macarrão na manteiga, maionese caseira, tempero especial e vem com os mais frescos camarões" +
                        "selecionados a dedo"),  Pratos("https://images.media-allrecipes.com/images/74681.jpg",
                        "macarrão integral, com camarões","Nosso macarrão tem um toque especial do Renomado chefe Gustavo Fraldine" +
                        ",Sendo considerado sua 'Obra Prima', o prato é composto por : Macarrão na manteiga, maionese caseira, tempero especial e vem com os mais frescos camarões" +
                        "selecionados a dedo"),  Pratos("https://images.media-allrecipes.com/images/74681.jpg",
                        "macarrão integral, com camarões","Nosso macarrão tem um toque especial do Renomado chefe Gustavo Fraldine" +
                        ",Sendo considerado sua 'Obra Prima', o prato é composto por : Macarrão na manteiga, maionese caseira, tempero especial e vem com os mais frescos camarões" +
                        "selecionados a dedo"), Pratos("https://images.media-allrecipes.com/images/74681.jpg",
                        "macarrão integral, com camarões","Nosso macarrão tem um toque especial do Renomado chefe Gustavo Fraldine" +
                        ",Sendo considerado sua 'Obra Prima', o prato é composto por : Macarrão na manteiga, maionese caseira, tempero especial e vem com os mais frescos camarões" +
                        "selecionados a dedo"))))

        restaurantes.add(Restaurant("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Zeca's Burger",
                "Av marechal pompozo 555",
                "Fecha as 00h00",
                mutableListOf(Pratos("https://i0.wp.com/www.eatthis.com/wp-content/uploads/2019/07/pizza-burger.jpg?fit=1200%2C879&ssl=1",
                        "X-picanha bacon",""))))


        restaurantes.add(Restaurant("https://d176s39pnpenan.cloudfront.net/wp-content/uploads/2019/11/pizza-386717_1920.jpg",
                "Pizza place",
                "Av marechal pompozo 555",
                "Fecha as 22h00",
                mutableListOf<Pratos>(Pratos("https://d176s39pnpenan.cloudfront.net/wp-content/uploads/2019/11/pizza-386717_1920.jpg",
                        "pizza mussarela",""))))

        restaurantes.add(Restaurant("https://conteudo.imguol.com.br/c/entretenimento/71/2020/05/27/guia-do-hamburguer---sanduiche-1590607899872_v2_450x337.jpg",
                "Sushi da Suzi",
                "Av marechal pompozo 555",
                "Fecha as 18h00",
                mutableListOf(Pratos("https://media-cdn.tripadvisor.com/media/photo-s/0a/ba/49/d7/izakaya-sushi.jpg",
                        "Barca sushi",""))))

    }
    private fun getActionbar() : ActionBar?
    {
        return (this.activity as AppCompatActivity).supportActionBar
    }
    private fun initComponents(){
        var actionBar = getActionbar()

        actionBar?.show()

    }
}
