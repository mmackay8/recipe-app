package com.bignerdranch.android.groceries.model

data class Recipe(var name: String, var ingredients: List<Ingredient>, var steps: List<String>, var temp: Int, var desc: String, var favorite: Boolean = false /*, var pic: Image*/)