package com.example.lookie_kotlin.Kotlin

fun main(array: Array<String>) {

    var score: Int = 70

    if (80 <= score && score <= 90) {
        println("당신의 학점은 A입니다.")
    } else if (70 <= score) {
        println("당신의 학점은 B입니다.")
    } else if (60 <= score) {
        println("당신의 학점은 C입니다.")
    } else {
        println("그저 F")
    }
}