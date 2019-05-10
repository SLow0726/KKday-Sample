package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Activity.MainActivity
import com.example.myapplication.MainAdapter.FeaturedAdapter
import com.example.myapplication.MainAdapter.RecentlyAdapter
import com.example.myapplication.MainAdapter.SpringAdapter
import com.example.myapplication.MainViewHolder.DataViewHolder
import com.example.myapplication.Object.Content
import com.example.myapplication.MainViewHolder.FeaturedViewHolder
import com.example.myapplication.Object.MainObject.recent
import com.example.myapplication.MainViewHolder.RecentlyViewHolder
import com.example.myapplication.MainViewHolder.SpringViewHolder
import com.example.myapplication.R
import kotlinx.android.synthetic.main.adapter_multiitem_mainadapter.view.*


class MultiItemAdapter(val multiItem: Content.MultiItem) : RecyclerView.Adapter<DataViewHolder>() {
    companion object {
        val First = 0
        val Second = 1
        val Third = 2
    }


    override fun getItemViewType(position: Int): Int {
        return when (position % 3) {
            0 -> First
            1 -> Second
            else -> Third

        }
    }

    var myMap =
        mapOf<Int, RecyclerView.Adapter<RecyclerView.ViewHolder>>(
            Pair(0, RecentlyAdapter(multiItem.list_Recently)),
            Pair(1, FeaturedAdapter(multiItem.list_Featured)),
            Pair(2, SpringAdapter(multiItem.list_Spring))
        )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(com.example.myapplication.R.layout.adapter_multiitem_mainadapter, parent, false)
        val viewSecond = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_multiitem_second_mainadapter, parent, false)

        return when (viewType) {
            First -> RecentlyViewHolder(view)
            Second -> FeaturedViewHolder(viewSecond)
            else -> SpringViewHolder(view)
        }
    }

    override fun getItemCount() = 3


    override fun onBindViewHolder(viewHolder: DataViewHolder, position: Int) {
//        viewHolder.itemView.textView.text = list[position]
        val multiTitle = viewHolder.itemView.tv_multi
        multiTitle.text = recent[position]
//        when (viewHolder) {
//            is RecentlyViewHolder -> {
//                val recentlyAdapter = RecentlyAdapter(multiItem.list_Recently)
        viewHolder.setData(myMap.getValue(position))

//            }
//            is FeaturedViewHolder -> {
//               val featuredAdapter = FeaturedAdapter(multiItem.list_Featured)
//                viewHolder.setData(featuredAdapter)
//
//            }
//            is SpringViewHolder -> {
//                val springAdapter = SpringAdapter(multiItem.list_Spring)
//                viewHolder.setSpring(springAdapter)
//
//            }
//        }
    }

}