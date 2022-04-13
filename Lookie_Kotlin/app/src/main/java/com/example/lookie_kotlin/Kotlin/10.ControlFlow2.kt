package com.example.lookie_kotlin.Kotlin

// 10. 제어흐름2

// When -> C언어의 switch-case 문과 유사

fun main(args: Array<String>) {

    val value: Int = 3

    when (value) {
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("dunno")
        }
    }

    // when 도 if와 마찬가지로 값을 return할 수 있다
    val value2 = when(value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
}