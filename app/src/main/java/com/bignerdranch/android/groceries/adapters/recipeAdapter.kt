package com.bignerdranch.android.groceries.adapters

import android.app.PendingIntent.getActivity
import android.content.Context
import android.content.Intent
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.groceries.MainActivity
import com.bignerdranch.android.groceries.R
import com.bignerdranch.android.groceries.RecipeDetails
import com.bignerdranch.android.groceries.model.Recipe
import com.bignerdranch.android.groceries.ui.DetailsFragment
import kotlinx.android.synthetic.main.recipe_rv.view.*

class RecipeAdapter(private val myDataset: List<Recipe>, val context: Context) :
        RecyclerView.Adapter<RecipeAdapter.RecipeVH>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeVH {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.recipe_rv, parent, false)
        return RecipeVH(layout, context)
    }


    override fun getItemCount(): Int {
        return myDataset.size
    }

    override fun onBindViewHolder(holder: RecipeVH, position: Int) {
        val recipe = myDataset.get(position)
        holder.recipeNameTV.text = recipe.name
        holder.checkBox.isActivated = recipe.favorite
        holder.checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            recipe.favorite = isChecked
        }
        holder.reciptDescTV.text = recipe.desc

    }

    class RecipeVH(var view: View, val context:Context) : RecyclerView.ViewHolder(view){
        val recipeNameTV = view.recipe_name
        val checkBox = view.checkBox
        val reciptDescTV = view.recipe_desc

        fun bind(recipe: Recipe, clickListener: AdapterView.OnItemClickListener){
            recipeNameTV.text = recipe.name
            reciptDescTV.text = recipe.desc
            itemView.setOnClickListener{
                val intent = Intent(context, RecipeDetails::class.java)

            }

        }
    }

}

