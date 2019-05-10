package com.example.myapplication.MainAdapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.Activity.SecondActivity
import com.example.myapplication.Object.Content
import com.example.myapplication.Object.MainObject
import com.example.myapplication.R
import kotlinx.android.synthetic.main.adapter_recently_mainadapter.view.*


class RecentlyAdapter(val list: List<Content.Recently>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecentlyAdapter.DataViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.adapter_recently_mainadapter, viewGroup, false)
        return DataViewHolder(view)
    }

    override fun getItemCount() = MainObject.RecentlyList.count()
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


        if (holder is RecentlyAdapter.DataViewHolder) {
            holder.bind(list[position])
            val url = MainObject.reImage.get(position)
            Glide.with(holder.itemView.context).load(url).override(500,400).into(holder.itemView.recently_image)

        }

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, SecondActivity::class.java)

            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

            it.context.startActivity(intent)
        }


    }


    inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.recently_image
        val country = itemView.country
        //        val score = itemView.score
        val detail = itemView.information
        val price = itemView.price
        val gps = itemView.iv_3
        val people = itemView.comment
        val TWD = itemView.tv_TWD
        var check = itemView.checkBox


        fun bind(content: Content.Recently) {
//            image.setImageResource(content.re_image)
            detail.text = content.re_detail
            gps.setImageResource(content.re_gps)
            country.text = content.re_country
            people.text = content.re_people
            TWD.text = content.re_TWD
            price.text = content.re_price
            check.isChecked = content.re_isChecked

            check.setOnClickListener {
                MainObject.RecentlyList[position].re_isChecked =
                    !MainObject.RecentlyList[position].re_isChecked
                Log.i("***Checked","${MainObject.RecentlyList[position].re_isChecked}")
            }
        }
    }
}