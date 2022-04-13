package com.example.lookie_kotlin.Kotlin

fun main(array: Array<String>) {

    val array = arrayOf<Int>(1, 2, 3)

    //get, set
    val number = array.get(0)
    println(number)
    // val number = array.get(100)
    //  -> 인덱스 범위를 넘었기 때문에 error

    // Array를 만드는 방법(3)
    // -> 제일 명시적인 방법!
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('y', 'e')
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false)

    // Array를 만드는 방법(4)
    // -> lambda를 활용한 방법


}