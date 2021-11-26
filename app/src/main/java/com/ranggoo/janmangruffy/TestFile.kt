package com.ranggoo.janmangruffy


sealed class Drink {
    data class Soju(val price: String = "3000원") : Drink()
    data class Wine(val price: String = "10000원") : Drink()
    data class Beer(val price: String = "1700원") : Drink()
}

fun main() {

    val drink:Drink = Drink.Beer()

    if(drink !is Drink.Soju){
        println("소주가 아니네?==> ${(drink as? Drink.Wine)?.price}")
    }

    when(drink){
        is Drink.Soju -> println("소주")
        is Drink.Wine -> println("와인")
        is Drink.Beer -> println("맥")
    }
}


// 정보를 저장하는 클래스
data class MyHome(
        val room: String,
        val family: String
) {
    var drink: String? = null
    var dog: String? = null
}



class Member(
        // 파라미터의 개념이다. 파라미터는 초기값을 지정해줘도되고 안해줘도 된다.
        val name: String = "이름없음",
        val phoneNumber: String
) {
    // 어떤 변수가 있잖아, 그럼 이거의 초기상태 값을 무조건 지정해줘야된다.
    // 여기는 필드값이다 필드 변수는 무조건 지정을 해줘야한다.
    // 그거 니가 지금 말하는 혹시 모를 상황의 널처리.
    // 그게 코틀린에서는 널세이프티를 지원을 한다.
    var nickName: String = "아이"
    lateinit var memberAge: String

    val password: String = "adfadfadfasdfasdfadfadfafdfad"

    fun getMemberInfo(): MemberInfo {
        memberAge = "dsdsdsdsds"
        return MemberInfo(
                mName = name,
                mNickName = nickName,
                mAge = memberAge
        )
    }

    data class MemberInfo(
            val mName: String,
            val mNickName: String,
            val mAge: String
    )
}

class PuzzleProblemChapter1(
        val puzzle: String,
        val member: Member,
        val haseung: String? = null
) {

    val result: String? = null

    fun solve(): String {
        val process = "adfadfadfadfadf"
        return process.toSolveFormat()
    }

    private fun String.toSolveFormat(): String {
        return "정답내요아싱ㅁㄹㅇ람인러ㅏㅣㅇㅁㄴ럼ㅇ라ㅣㅁ"
    }
}

