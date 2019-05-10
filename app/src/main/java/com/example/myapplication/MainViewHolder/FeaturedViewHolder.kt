package com.example.myapplication.MainViewHolder

import android.view.View
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.MainAdapter.FeaturedAdapter
import kotlinx.android.synthetic.main.adapter_multiitem_second_mainadapter.view.*

class FeaturedViewHolder(view: View) : DataViewHolder(view) {

    override fun setData(adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>) {
        val recyclerView = itemView.recyclerViewChildSecond
        val layoutManager = LinearLayoutManager(itemView.context, LinearLayout.HORIZONTAL, false)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
    }

}