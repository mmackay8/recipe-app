package com.bignerdranch.android.groceries.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bignerdranch.android.groceries.model.Recipe

class HomeViewModel : ViewModel() {
    val recipes = listOf(Recipe("Mac & Cheese", listOf(), listOf(), 0, "This is the descriptions for Mac And Cheese"),
        Recipe("Chocolate Chip Cookies", listOf(), listOf(), 325, "This recipe is for the best CCC. Melt in your mouth."),
        Recipe("Popcorn", listOf(), listOf(), 250, "Pop it!")
        )
    private val recipe = MutableLiveData<MutableList<Recipe>>().apply {
        value = mutableListOf(Recipe("Mac & Cheese", listOf(), listOf(), 0, "This is the descriptions for Mac And Cheese"),
            Recipe("Chocolate Chip Cookies", listOf(), listOf(), 325, "This recipe is for the best CCC. Melt in your mouth."),
            Recipe("Popcorn", listOf(), listOf(), 250, "Pop it!")
        )
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}