package com.example.myapplication.MainViewHolder

import android.view.View
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_multiitem_mainadapter.view.*

open class DataViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    open fun setData(adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>){
        val recyclerView = itemView.recyclerViewChild
        val layoutManager = LinearLayoutManager(itemView.context, LinearLayout.HORIZONTAL, false)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)

    }
}