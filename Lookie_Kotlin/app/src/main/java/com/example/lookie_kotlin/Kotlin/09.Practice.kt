package com.example.lookie_kotlin.Kotlin

fun main(args:Array<String>) {

    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("b plus c is 110")
    } else {
        println("b plus c is not 110")
    }

    // 엘비스 연산자 ?:
    // Kotlin은 null-safety 언어이기 때문에 null에 잘 대응할 수 있도록 문법적으로 도와준다
    // number가 null이면 10을 return 한다.

    val number: Int? = null
    val number2 = number ?: 10
    println()
    println(number2)

    val num1: Int = 10
    val num2: Int = 20


}