package com.example.lookie_kotlin.Kotlin

// 전역, 지역변수

// 변수의 접근 범위
// 1. 전역변수
// 2. 지역변수

var number100: Int = 10

fun main(args: Array<String>) {
    println(number100)
}

class Test(var name: String) {

    fun testFun() {
        name = "홍길동"
        number100 = 100
    }
}

