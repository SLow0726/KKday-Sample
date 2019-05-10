package com.example.myapplication.Activity

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.LayerDrawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.PagerSnapHelper
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.MainAdapter.RecentlyAdapter
import com.example.myapplication.Object.Content
import com.example.myapplication.Object.MainObject
import com.example.myapplication.SecondAdapter.SliderAdapter
import com.example.myapplication.adapter.MultiItemAdapter
import kotlinx.android.synthetic.main.adapter_recently_mainadapter.*


class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener
            = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                title = "Home"
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search -> {
                title = "Search"
                return@OnNavigationItemSelectedListener false
            }
            R.id.navigation_favorites -> {
                return@OnNavigationItemSelectedListener false
            }
            R.id.navigation_order -> {
                return@OnNavigationItemSelectedListener false
            }
            R.id.navigation_mine -> {
                return@OnNavigationItemSelectedListener false
            }
        }
        false
    }

    //    val list = listOf<Content>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val list = Content.MultiItem(
            MainObject.RecentlyList,
            MainObject.FeaturedList,
            MainObject.SpringList
        )
        val multiItemAdapter = MultiItemAdapter(list)
        recyclerViewMain.layoutManager = LinearLayoutManager(this)
        recyclerViewMain.adapter = multiItemAdapter


    }

}
