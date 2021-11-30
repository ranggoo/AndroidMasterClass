package com.ranggoo.janmangruffy

// 샵이라는 인터페이스가 있지.
// 근데 바디를 보게되면, 데이터타입이 스트링은 로케이션이라는 변수(필드)가 있어.
// 또 셀과 바이라는 펑션이 있지.
interface Shop {
    val location: String
    fun sell()
    fun buy()
}

// 카페라는 클래스가 있어.
// 근데 shop이라는 인터페이스를 받아서 쓰고 있네(구현을 하고 있네)?
// location은 송정동으로 초기화가 되어있고
// 남은 셀과 바이라는 펑션도 초기화가 되어있어.
class Cafe : Shop {
    override val location: String = "송정동 72-110"
    override fun sell() {
        println("파는기능..")
    }

    override fun buy() {
        println("사는기능..")
    }
}

// 카페를 생성하고.
// 바이라는 메소드를 호출(콜)했네.
// 출력 -> 로그를 찍었따. 로그를 찍어봤더니, 프린트를 해봤더니,
fun main(){
    val newCafe = Cafe()
    newCafe.buy()

}