package com.example.myapplication.SecondAdapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Activity.SecondActivity
import com.example.myapplication.Object.MainObject
import com.example.myapplication.Object.SecondObject.moreComment
import com.example.myapplication.Object.SecondObject.moreCountry
import com.example.myapplication.Object.SecondObject.moreImage
import com.example.myapplication.Object.SecondObject.morePrice
import com.example.myapplication.Object.SecondObject.moreTitle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.adapter_recommend_secondadapter.view.*

class RecommendAdapter : RecyclerView.Adapter<RecommendAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.adapter_recommend_secondadapter, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = moreTitle.count()
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.info.text = moreTitle[position]
        holder.country.text = moreCountry[position]
        holder.comment.text = moreComment[position]
        holder.price.text = morePrice[position]
        holder.image.setImageResource(moreImage[position])



    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val info = itemView.more_info
        val country = itemView.more_country
        val score = itemView.more_score
        val comment = itemView.more_comment
        val price = itemView.more_price
        val image = itemView.more_image
    }

}