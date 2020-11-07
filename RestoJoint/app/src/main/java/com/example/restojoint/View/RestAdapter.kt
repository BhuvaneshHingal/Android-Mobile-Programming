package com.example.restojoint.View

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.restojoint.R
import com.example.restojoint.model.Restaurant

class RestAdapter(val resto_list:List<Restaurant>):RecyclerView.Adapter<RestAdapter.restaurantViewholder>() {
    class restaurantViewholder(itemview: View): RecyclerView.ViewHolder(itemview){
        val resto_name = itemview.findViewById<TextView>(R.id.r_name)
        val resto_address = itemview.findViewById<TextView>(R.id.r_address)
        val resto_speciality = itemview.findViewById<TextView>(R.id.r_speciality)
        val resto_rating = itemview.findViewById<TextView>(R.id.r_rating)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): restaurantViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.project_row_layout,parent,false)
        return restaurantViewholder(view)
    }

    override fun onBindViewHolder(holder: restaurantViewholder, position: Int) {
        holder.apply {
            resto_name.text = resto_list[position].Name
            resto_address.text = resto_list[position].Address
            resto_speciality.text = resto_list[position].Speciality
            resto_rating.text = resto_list[position].Rating
        }
    }

    override fun getItemCount(): Int {
        return resto_list.size
    }
}