package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class listFood : AppCompatActivity() {

    private lateinit var foodName: TextView
    private lateinit var foodImg: ImageView
    private lateinit var foodDes: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_food)

        foodName = findViewById(R.id.foodName)
        foodImg = findViewById(R.id.foodImg)
        foodDes = findViewById(R.id.sFoodDetalis)

        var name = intent.getStringExtra("name")
        var img = intent.getIntExtra("image", R.drawable.pizza)
        var desc = intent.getStringExtra("longdesc")

        foodDes.text = desc
        foodName.text = name
        foodImg.setImageResource(img)
    }
}