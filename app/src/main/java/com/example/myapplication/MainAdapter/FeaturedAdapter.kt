package com.example.myapplication.MainAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.MainViewHolder.DataViewHolder
import com.example.myapplication.Object.Content
import com.example.myapplication.Object.MainObject
import com.example.myapplication.Object.MainObject.feCountryName
import com.example.myapplication.Object.MainObject.feCountry
import com.example.myapplication.R
import kotlinx.android.synthetic.main.adapter_featured_mainadapter.view.*


class FeaturedAdapter(val list: List<Content.Featured>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_featured_mainadapter, parent, false)
        return DataViewHolder(view)
    }

    override fun getItemCount() = feCountryName.count()


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is FeaturedAdapter.DataViewHolder) {
            holder.bind(list[position])

        }

    }

    inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val Name = itemView.CountryName
        val Featured = itemView.FeaturedCountry


        fun bind(content: Content.Featured) {

            Name.text = content.fe_country
            Featured.setImageResource(content.fe_image)

        }
    }
}

