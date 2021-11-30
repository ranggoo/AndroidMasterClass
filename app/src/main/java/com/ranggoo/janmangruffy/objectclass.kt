package com.ranggoo.janmangruffy

interface ItemEvent {
    fun onClick()
    fun onScroll()
    fun onDoubleClick()
}

interface ItemEvent2 : ItemEvent {
    override fun onClick() {
        TODO("Not yet implemented")
    }
}

class RcvEventClass : ItemEvent {
    override fun onClick() {
        println("onClick")
    }

    override fun onScroll() {
        println("onScroll")
    }

    override fun onDoubleClick() {
        println("onDoubleClick")
    }
}

object RcvTestClass : ItemEvent {
    override fun onClick() {
        TODO("Not yet implemented")
    }

    override fun onScroll() {
        TODO("Not yet implemented")
    }

    override fun onDoubleClick() {
        TODO("Not yet implemented")
    }
}


fun main() {

}


// 클래스의 특징.
// 상속을 받을 수 있다. ==> 클래스를 상속 받을 수 있다.
abstract class Parent {
    val money: Int = 5000
    val building: String = "롯데타워"

    abstract fun makeMoney()

    fun test(): String {
        return "하이"
    }
}