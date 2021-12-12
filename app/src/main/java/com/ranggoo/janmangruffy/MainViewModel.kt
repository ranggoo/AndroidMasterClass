package com.ranggoo.janmangruffy

import android.content.Context
import android.graphics.drawable.Drawable

data class ItemRuffy(
    var id: Int,
    val title: String,
    val content: String,
    val image: Drawable?,
)

class MainViewModel {


    fun getRuffies(context: Context): List<ItemRuffy> {
        val list = mutableListOf<ItemRuffy>()
        list.add(
            ItemRuffy(
                id  =  1,
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_1)
            )
        )
        list.add(
            ItemRuffy(
                id  =  2,
                title = "너지스님을 꼬라보는 루피.1",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_2)
            )
        )
        list.add(
            ItemRuffy(
                id  =  3,
                title = "너지스님을 꼬라보는 루피.2",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_3)
            )
        )
        return list

    }

}