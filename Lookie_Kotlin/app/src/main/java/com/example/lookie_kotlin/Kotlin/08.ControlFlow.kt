package com.example.lookie_kotlin.Kotlin

// 08.제어 흐름
// -if, else

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    // if/else 사용하는 방법 (1)
    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }

    // if/else 사용하는 방법 (2)
    if (a > b) {
        println("a가 b보다 크다")
    }

    // if/else/else if 사용하는 방법 (3)
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 작다")
    } else {
        println("a와 b는 같다")
    }

    // 값을 리턴하는 if 사용방법
    val max = if (a > b) {
        a
    } else {
        b
    }

    // 값을 리턴하는 if 사용방법 (2)
    val max1 = if (a > b) a else b
    // c언어로 똑같이 적어보면 int max = (a > b) ? a : b

    // ***** 값을 리턴하는 if를 사용할때는 무조건 값을 반환해야 한다 !!
    //  아니면 syntax error

}
