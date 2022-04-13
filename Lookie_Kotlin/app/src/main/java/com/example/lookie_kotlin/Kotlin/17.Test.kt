package com.example.lookie_kotlin.Kotlin

//1번문제

fun main(array: Array<String>) {
    var ArrayList1 = mutableListOf<Int>()
    var ArrayList2 = mutableListOf<Boolean>()

    for (i in 0 until 10) {
        ArrayList1.add(i)
    }

    for (i in 0 until 10) {
        if (ArrayList1[i] % 2 == 0) {
            ArrayList2.add(true)
        } else {
            ArrayList2.add(false)
        }
    }

    println(ArrayList1)
    println(ArrayList2)
    // true, false는 소문자 ..
}

