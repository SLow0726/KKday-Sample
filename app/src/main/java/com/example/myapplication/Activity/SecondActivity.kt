package com.example.myapplication.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.SecondAdapter.SliderAdapter
import com.example.myapplication.R
import com.example.myapplication.SecondAdapter.RecommendAdapter
import kotlinx.android.synthetic.main.activity_second.*
import android.graphics.PorterDuff
import android.graphics.drawable.LayerDrawable
import android.widget.RatingBar
import android.graphics.Color
import android.os.Build
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.myapplication.Object.SecondObject
import kotlinx.android.synthetic.main.cons_comment.*
import kotlinx.android.synthetic.main.cons_four.*
import kotlinx.android.synthetic.main.cons_title.*
import kotlinx.android.synthetic.main.cons_travel.*
import kotlinx.android.synthetic.main.recyclerview_cons_a.*
import java.util.*


class SecondActivity : AppCompatActivity() {

    var images: IntArray = intArrayOf(
        com.example.myapplication.R.drawable.hongkong,
        com.example.myapplication.R.drawable.kyoto,
        com.example.myapplication.R.drawable.paris
    )
    var sliderAdapter: SliderAdapter = SliderAdapter(this, images)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.myapplication.R.layout.activity_second)



        showViewPage()
        snap()


        val adapter = RecommendAdapter()
        recycleSecond.layoutManager = LinearLayoutManager(this,LinearLayout.HORIZONTAL,false)
        recycleSecond.adapter = adapter






        title_title.text = SecondObject.title
        tv_detail.text = SecondObject.title_detailed
        iv_fourButton.setImageResource(SecondObject.image_button[0])
        tv_travel_1.text = SecondObject.travel[0]
        tv_travel_2.text = SecondObject.travel[1]
        tv_travel_3.text = SecondObject.travel[2]
        iv_gps.setImageResource(SecondObject.image[0])
        iv_mark.setImageResource(SecondObject.image[1])
        iv_travel_time.setImageResource(SecondObject.image[2])
        tv_comment.text = SecondObject.comment
        iv_profile.setImageResource(SecondObject.image[3])
        iv_lightning.setImageResource(SecondObject.image[4])

    }

    fun showViewPage(){
        view_pager.adapter = sliderAdapter
        circle_page.setViewPager(view_pager)
    }

    fun snap(){
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(recycleSecond)
    }
}
