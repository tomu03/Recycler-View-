package com.example.recyclerview

import android.content.Intent
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

        food.add(foods("Burger", "Fast food item", R.drawable.burger,"Pizza  A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type. The sandwich began as a portable, convenient finger food in the Western world, though over time it has become prevalent worldwide. In the 21st century there has been considerable debate over the precise definition of sandwich, and specifically whether a hot dog or open sandwich can be categorized as such. In the United States, the Department of Agriculture and the Food and Drug Administration are the responsible agencies. The USDA uses the definition, at least 35% cooked meat and no more than 50% bread for closed sandwiches, and at least 50% cooked meat for open sandwiches.[4] In Britain, the British Sandwich Association defines a sandwich as any form of bread with a filling, generally assembled cold, a definition which includes wraps and bagels, but excludes dishes assembled and served hot, such as burgers.Sandwiches are a popular type of lunch food, taken to work, school, or picnics to be eaten as part of a packed lunch. The bread may be plain or be coated with condiments, such as mayonnaise or mustard, to enhance its flavour and texture. As well as being homemade, sandwiches are also widely sold in various retail outlets and can be served hot or cold. There are both savoury sandwiches, such as deli meat sandwiches, and sweet sandwiches, such as a peanut butter and jelly sandwich. The sandwich is named after its supposed inventor, John Montagu, 4th Earl of Sandwich. The Wall Street Journal has described it as Britain's biggest contribution to gastronomy."))
        food.add(foods("Pizza", "Fast food item", R.drawable.pizza,"Pizza  A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type. The sandwich began as a portable, convenient finger food in the Western world, though over time it has become prevalent worldwide. In the 21st century there has been considerable debate over the precise definition of sandwich, and specifically whether a hot dog or open sandwich can be categorized as such. In the United States, the Department of Agriculture and the Food and Drug Administration are the responsible agencies. The USDA uses the definition, at least 35% cooked meat and no more than 50% bread for closed sandwiches, and at least 50% cooked meat for open sandwiches.[4] In Britain, the British Sandwich Association defines a sandwich as any form of bread with a filling, generally assembled cold, a definition which includes wraps and bagels, but excludes dishes assembled and served hot, such as burgers.Sandwiches are a popular type of lunch food, taken to work, school, or picnics to be eaten as part of a packed lunch. The bread may be plain or be coated with condiments, such as mayonnaise or mustard, to enhance its flavour and texture. As well as being homemade, sandwiches are also widely sold in various retail outlets and can be served hot or cold. There are both savoury sandwiches, such as deli meat sandwiches, and sweet sandwiches, such as a peanut butter and jelly sandwich. The sandwich is named after its supposed inventor, John Montagu, 4th Earl of Sandwich. The Wall Street Journal has described it as Britain's biggest contribution to gastronomy."))
        food.add(foods("Fries", "Fast food item", R.drawable.fries,"Pizza  A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type. The sandwich began as a portable, convenient finger food in the Western world, though over time it has become prevalent worldwide. In the 21st century there has been considerable debate over the precise definition of sandwich, and specifically whether a hot dog or open sandwich can be categorized as such. In the United States, the Department of Agriculture and the Food and Drug Administration are the responsible agencies. The USDA uses the definition, at least 35% cooked meat and no more than 50% bread for closed sandwiches, and at least 50% cooked meat for open sandwiches.[4] In Britain, the British Sandwich Association defines a sandwich as any form of bread with a filling, generally assembled cold, a definition which includes wraps and bagels, but excludes dishes assembled and served hot, such as burgers.Sandwiches are a popular type of lunch food, taken to work, school, or picnics to be eaten as part of a packed lunch. The bread may be plain or be coated with condiments, such as mayonnaise or mustard, to enhance its flavour and texture. As well as being homemade, sandwiches are also widely sold in various retail outlets and can be served hot or cold. There are both savoury sandwiches, such as deli meat sandwiches, and sweet sandwiches, such as a peanut butter and jelly sandwich. The sandwich is named after its supposed inventor, John Montagu, 4th Earl of Sandwich. The Wall Street Journal has described it as Britain's biggest contribution to gastronomy."))
        food.add(foods("Taco", "Fast food item", R.drawable.taco,"Pizza  A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type. The sandwich began as a portable, convenient finger food in the Western world, though over time it has become prevalent worldwide. In the 21st century there has been considerable debate over the precise definition of sandwich, and specifically whether a hot dog or open sandwich can be categorized as such. In the United States, the Department of Agriculture and the Food and Drug Administration are the responsible agencies. The USDA uses the definition, at least 35% cooked meat and no more than 50% bread for closed sandwiches, and at least 50% cooked meat for open sandwiches.[4] In Britain, the British Sandwich Association defines a sandwich as any form of bread with a filling, generally assembled cold, a definition which includes wraps and bagels, but excludes dishes assembled and served hot, such as burgers.Sandwiches are a popular type of lunch food, taken to work, school, or picnics to be eaten as part of a packed lunch. The bread may be plain or be coated with condiments, such as mayonnaise or mustard, to enhance its flavour and texture. As well as being homemade, sandwiches are also widely sold in various retail outlets and can be served hot or cold. There are both savoury sandwiches, such as deli meat sandwiches, and sweet sandwiches, such as a peanut butter and jelly sandwich. The sandwich is named after its supposed inventor, John Montagu, 4th Earl of Sandwich. The Wall Street Journal has described it as Britain's biggest contribution to gastronomy."))
        food.add(foods("Sandwich", "Fast food item", R.drawable.sandwich,"Pizza  A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type. The sandwich began as a portable, convenient finger food in the Western world, though over time it has become prevalent worldwide. In the 21st century there has been considerable debate over the precise definition of sandwich, and specifically whether a hot dog or open sandwich can be categorized as such. In the United States, the Department of Agriculture and the Food and Drug Administration are the responsible agencies. The USDA uses the definition, at least 35% cooked meat and no more than 50% bread for closed sandwiches, and at least 50% cooked meat for open sandwiches.[4] In Britain, the British Sandwich Association defines a sandwich as any form of bread with a filling, generally assembled cold, a definition which includes wraps and bagels, but excludes dishes assembled and served hot, such as burgers.Sandwiches are a popular type of lunch food, taken to work, school, or picnics to be eaten as part of a packed lunch. The bread may be plain or be coated with condiments, such as mayonnaise or mustard, to enhance its flavour and texture. As well as being homemade, sandwiches are also widely sold in various retail outlets and can be served hot or cold. There are both savoury sandwiches, such as deli meat sandwiches, and sweet sandwiches, such as a peanut butter and jelly sandwich. The sandwich is named after its supposed inventor, John Montagu, 4th Earl of Sandwich. The Wall Street Journal has described it as Britain's biggest contribution to gastronomy."))

        var foodAdapter = foodAdapter(food)
        binding.recyclerView.adapter = foodAdapter

        foodAdapter.onclick = {
            val intent = Intent(this, listFood::class.java)
             intent.putExtra("name",it.foodName)
             intent.putExtra("details",it.details)
             intent.putExtra("image",it.foodImage)

            startActivity(intent)
        }


    }

}