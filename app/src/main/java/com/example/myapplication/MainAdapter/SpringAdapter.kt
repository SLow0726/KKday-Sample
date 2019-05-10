package com.example.myapplication.MainAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Object.Content
import com.example.myapplication.Object.MainObject
import com.example.myapplication.R
import kotlinx.android.synthetic.main.adapter_spring_mainadapter.view.*


class SpringAdapter(val list: List<Content.Recently>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): SpringAdapter.DataViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.adapter_spring_mainadapter, viewGroup, false)
        return DataViewHolder(view)
    }

    override fun getItemCount() = MainObject.SpringList.count()
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


        if (holder is SpringAdapter.DataViewHolder) {
            holder.bind(list[position])

        }


    }

    inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image = itemView.sp_image
        val country = itemView.sp_country
        //        val score = itemView.score
        val detail = itemView.sp_detail
        val price = itemView.sp_price
        val gps = itemView.sp_gps
        val people = itemView.sp_comment
        val TWD = itemView.sp_TWD
        var check = itemView.sp_checkBox


        fun bind(content: Content.Recently) {

            image.setImageResource(content.re_image)
            detail.text = content.re_detail
            gps.setImageResource(content.re_gps)
            country.text = content.re_country
            people.text = content.re_people
            TWD.text = content.re_TWD
            price.text = content.re_price
            check.isChecked = content.re_isChecked

            check.isChecked = content.re_isChecked

            check.setOnClickListener {
                MainObject.SpringList[position].re_isChecked =
                    !MainObject.SpringList[position].re_isChecked
            }

        }

    }
}
