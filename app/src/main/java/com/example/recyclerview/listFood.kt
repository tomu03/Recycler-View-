package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recyclerview.databinding.ActivityListFoodBinding
import com.example.recyclerview.databinding.ActivityMainBinding

class listFood : AppCompatActivity() {

    private lateinit var binding: ActivityListFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListFoodBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var name = intent.getStringExtra("name")
        var img = intent.getIntExtra("image", R.drawable.pizza)
        var desc = intent.getStringExtra("details")

        binding.foodName.text = name.toString()
        binding.foodDetalis.text = desc.toString()
        binding.foodImg.setImageResource(img)
    }
}