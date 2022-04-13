package com.example.lookie_kotlin.Kotlin

// 14. collection
//   -> list, set, map

// List

fun main(args: Array<String>) {

    // Immutable Collections
    // 변경 불가능

    // List -> 중복을 허용한다
    val numberList = listOf<Int>(1, 2, 3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    // Set -> 중복을 허용하지 않는다
    // -> 순서가 없다 !! => index가 존재하지 않는다
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    numberSet.forEach {
        println(it)
    }

    // Map -> Key, Value 방식으로 관리한다 c언어 딕셔너리랑 유사한 듯
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))

    // Mutable collecion
    // 변경가능
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberList.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)


}