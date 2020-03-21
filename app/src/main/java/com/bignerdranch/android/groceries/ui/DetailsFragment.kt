package com.bignerdranch.android.groceries.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bignerdranch.android.groceries.R
import com.bignerdranch.android.groceries.model.Recipe
import kotlinx.android.synthetic.main.fragment_recipe_details.view.*

class DetailsFragment (val recipe:Recipe) : Fragment () {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_recipe_details, container, false)
        root.recipe_name_details.text = recipeName
        return root
        //super.onCreateView(inflater, container, savedInstanceState)

    }
}