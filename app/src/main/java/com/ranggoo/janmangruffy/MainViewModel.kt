package com.ranggoo.janmangruffy

import android.content.Context
import android.graphics.drawable.Drawable

data class ItemRuffy(
    val title: String,
    val content: String,
    val image: Drawable?,
)


class MainViewModel() {

    fun getRuffies(context: Context): List<ItemRuffy> {
        val list = mutableListOf<ItemRuffy>()
        // 그래서 이런 예제를 만들라고 넘겨줄수 밖에 없었다.
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_1)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.1",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_2)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.2",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_3)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.3",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_4)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_5)
            )
        )

        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_5)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_6)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_7)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_8)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_9)
            )
        )


        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_1)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.1",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_2)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.2",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_3)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.3",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_4)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_5)
            )
        )

        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_5)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_6)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_7)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_8)
            )
        )
        list.add(
            ItemRuffy(
                title = "너지스님을 꼬라보는 루피.",
                content = "루피루피루피루피루피루",
                image = context.getDrawable(R.drawable.a_9)
            )
        )

        // usecase를 써서 데이터를 받아왔다고 가정.
        return list // <-- 엔터티.

    }

}