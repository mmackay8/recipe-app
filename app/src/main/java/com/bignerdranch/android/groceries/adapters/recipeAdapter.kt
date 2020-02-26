package com.bignerdranch.android.groceries.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.groceries.R
import com.bignerdranch.android.groceries.model.Recipe
import kotlinx.android.synthetic.main.recipe_rv.view.*

class RecipeAdapter(private val myDataset: List<Recipe>) :
        RecyclerView.Adapter<RecipeAdapter.RecipeVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeVH {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.recipe_rv, parent, false)
        return RecipeVH(layout)
    }

    override fun getItemCount(): Int {
        return myDataset.size
    }

    override fun onBindViewHolder(holder: RecipeVH, position: Int) {
        val recipe = myDataset.get(position)
        holder.recipeNameTV.text = recipe.name
        holder.checkBox.isActivated = false
        holder.reciptDescTV.text = recipe.desc

    }

    class RecipeVH(var view: View) : RecyclerView.ViewHolder(view){
        val recipeNameTV = view.recipe_name
        val checkBox = view.checkBox
        val reciptDescTV = view.recipe_desc
    }
}
