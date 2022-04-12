package com.example.lookie_kotlin.Kotlin

// 02. 자료형
// 정수형 -> Long > Int > Short > Byte
// 상수형 -> Double > float
// 문자 -> Char
// 문자열 -> String
// 논리형(T/F) -> Boolean

var number = 10

// 변수 선언하는 방법 (2)
// var/val 변수 : 자료형 = 값
// 자료형을 적지 않으면 넣은 값의 자료형으로 알아서 자료형이 정해짐
// 자료형을 명시해주는 것이 좀 더 좋은 방법 !
// 자료형 명시해줄때 대문자 주의

// variable vs. value ??
//    -> 바뀌는 값이면 Variable
//    -> 바뀌지 않는 값이면 value

var number1 : Int = 20
var hello1 : String = "Hello"

fun main(array: Array<String>){
    number = 20
   // number = 20.5
}

