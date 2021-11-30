package com.ranggoo.janmangruffy

// 코틀린
// data class => 데이터들을 객체화 시켜서 저장할 때 사용.
// class => 클래스는 코드에서 객체화 된 기능.
// sealed class => 클래스들을 묶어서 구분할 때 사용.


sealed class Animal(val price: Int) {
    object Dog : Animal(price = 5000)
    data class Cat(val _price: Int) : Animal(price = _price)
    data class Lion(val _price: Int) : Animal(price = _price)
}

fun main() {


    // 동물샵에 동물을 하나 받았다.
    val dog = Animal.Dog // 나는 정답을 아는 상태.

    // 이 동물이 개 일까요?
    val isDog = isAnimalDog(dog)

    // 이 동물의 가격.
    val animalPrice = getAnimalPrice(dog)
}

fun getAnimalPrice(what: Animal): Int = what.price

/*
fun isAnimalDog(what: Animal): Boolean {
    return when(what){
        Animal.Dog -> true
        else -> false
    }
}
*/
fun isAnimalDog(what: Animal): Boolean = when (what) {
    Animal.Dog -> true
    is Animal.Cat -> false
    is Animal.Lion -> false
}
