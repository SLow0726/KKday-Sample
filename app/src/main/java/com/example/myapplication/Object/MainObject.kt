package com.example.myapplication.Object

import com.example.myapplication.R

object MainObject {
//    val recent_recyclerview = listOf(RecentlyList(), FeaturedList())


    val recent = arrayListOf("最近預覽", "精選城市", "春日櫻花 浪漫獻映")
    val reTitle =
        arrayListOf("【東京巴士一日遊】富士山．河口湖．忍野八海．御殿場 Outlet (保證有位)", "【韓國賞櫻推薦】首爾出發鎮海軍港節一日遊", "【2019京都賞櫻】嵐山小火車保證有限量車票 (季節限定)")
    val reCountry = arrayListOf("日本,東京", "韓國,首爾,多個城市", "日本,京都 ")
    //val reRating = arrayListOf("1", "2", "3")
    val reComment = arrayListOf("(99)", "(1,000)", "(888)")
    val rePrice = arrayListOf("1,584", "1,333", "1,880")
    val reImage = arrayListOf(
        R.drawable.tokyo,
        R.drawable.korea2,
        R.drawable.kyoto2
    )


    val feCountry = arrayListOf(
        R.drawable.paris,
        R.drawable.seoul,
        R.drawable.tokyo,
        R.drawable.hongkong,
        R.drawable.okinawa,
        R.drawable.newyork
    )
    val feCountryName = arrayListOf("巴黎", "首爾", "東京", "香港", "沖繩", "紐約")





    val RecentlyList = listOf(
        Content.Recently(
            R.drawable.tokyo, "【東京巴士一日遊】富士山．河口湖．忍野八海．御殿場 Outlet (保證有位)"
            , R.drawable.gps2, "日本,東京", "(99)", "TWD"
            , "1,584",false
        ),
        Content.Recently(
            R.drawable.korea2, "【韓國賞櫻推薦】首爾出發鎮海軍港節一日遊", R.drawable.gps2
            , "韓國,首爾,多個城市", "(1000)", "TWD"
            , "1,333",false
        ),
        Content.Recently(
            R.drawable.kyoto2, "【2019京都賞櫻】嵐山小火車保證有限量車票 (季節限定)", R.drawable.gps2
            , "日本,京都 ", "(888)", "TWD"
            , "1,880",false
        )
    )

    val FeaturedList = listOf(
        Content.Featured(R.drawable.paris, "巴黎"),

        Content.Featured(R.drawable.seoul, "首爾"),

        Content.Featured(R.drawable.tokyo, "東京"),

        Content.Featured(R.drawable.hongkong, "香港"),

        Content.Featured(R.drawable.okinawa, "沖繩"),

        Content.Featured(R.drawable.newyork, "紐約"))

    val SpringList = listOf(
        Content.Recently(
            R.drawable.tokyo, "【東京巴士一日遊】富士山．河口湖．忍野八海．御殿場 Outlet (保證有位)"
            , R.drawable.gps2, "日本,東京", "(99)", "TWD"
            , "1,584",false
        ),
        Content.Recently(
            R.drawable.korea2, "【韓國賞櫻推薦】首爾出發鎮海軍港節一日遊", R.drawable.gps2
            , "韓國,首爾,多個城市", "(1000)", "TWD"
            , "1,333",false
        ),
        Content.Recently(
            R.drawable.kyoto2, "【2019京都賞櫻】嵐山小火車保證有限量車票 (季節限定)", R.drawable.gps2
            , "日本,京都 ", "(888)", "TWD"
            , "1,880",false
        )
    )


}
