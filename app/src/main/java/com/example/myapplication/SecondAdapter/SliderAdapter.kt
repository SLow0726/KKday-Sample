package com.example.myapplication.SecondAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.myapplication.R

class SliderAdapter(var context: Context, private var items: IntArray) : PagerAdapter() {

    lateinit var inflater: LayoutInflater

    override fun isViewFromObject(view: View, any: Any): Boolean {
        return view == any
    }//回傳一個 Boolean 值，告訴呼叫此方法的那些 function
    // 他們想判斷的 view 和我們創建的 Object 是不是同一個

    override fun getCount(): Int = items.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val images: ImageView
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_slider_secondadapter, container, false)
        images = view.findViewById(R.id.slider_images)
        images.setBackgroundResource(this.items[position])
        container.addView(view)
        return view

    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }//銷毀對應位置的object


}



