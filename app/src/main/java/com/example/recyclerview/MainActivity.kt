package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val food = ArrayList<foods>()

        food.add(foods("Burger", "Fast food item", R.drawable.burger))
        food.add(foods("Pizza", "Fast food item", R.drawable.pizza))
        food.add(foods("Fries", "Fast food item", R.drawable.fries))
        food.add(foods("Taco", "Fast food item", R.drawable.taco))
        food.add(foods("Sandwich", "Fast food item", R.drawable.sandwich))

        binding.recyclerView.adapter = foodAdapter(food)




    }
}