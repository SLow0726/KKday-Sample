package com.example.myapplication.Object

import android.media.Image
import android.media.Rating
import android.widget.ImageView
import java.util.*

class Content {

    data class Recently(
        val re_image : Int , val re_detail : String ,
        val re_gps : Int , val re_country : String ,
        val re_people : String , val re_TWD : String ,
        val re_price : String , var re_isChecked : Boolean)

    data class Featured(
        val fe_image: Int, val fe_country: String)

    data class MultiItem(
        val list_Recently : List<Content.Recently>,
        val list_Featured : List<Content.Featured>,
        val list_Spring : List<Content.Recently>
    )

}