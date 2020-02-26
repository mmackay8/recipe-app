package com.bignerdranch.android.groceries.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.groceries.R
import com.bignerdranch.android.groceries.adapters.RecipeAdapter
import com.bignerdranch.android.groceries.model.Recipe
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val recipes = listOf(
            Recipe("Mac & Cheese", listOf(), 0, "This is the descriptions for Mac And Cheese"),
            Recipe("Chocolate Chip Cookies", listOf(), 325, "This recipe is for the best CCC. Melt in your mouth."),
            Recipe("Popcorn", listOf(), 250, "Pop it!")
        )

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        root!!.home_rv.adapter = RecipeAdapter(recipes)
        root.home_rv.layoutManager = LinearLayoutManager(context)




        return root
        }


/*
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }*/
}