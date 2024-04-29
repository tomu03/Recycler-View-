package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemListBinding

class foodAdapter(private val foodList:ArrayList<foods>):RecyclerView.Adapter<foodAdapter.MyViewHolder>()  {
    class MyViewHolder(val binding: ItemListBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val food = foodList[position]
        holder.binding.apply {
            foodName.text = food.foodName
            foodDetails.text = food.foodDetails
            foodImg.setImageResource(food.foodImage)

            }
        }
    }
}