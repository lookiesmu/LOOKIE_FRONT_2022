package com.example.lookie_kotlin.Kotlin

// 04. Function
// - 함수란
//      - 어떤 input을 넣어주면 output 나오는 것
//      - y = x + 2

// - 함수를 선언하는 방법
// fun  함수명 (변수명: 타입, 변수명: 타입 ......) : 반환형 {
//      함수 내용
//      return 반환값
// }

// ctrl/command + / -> 자동 주석처리

// 자동정렬단축키 ctrl + alt + l
// Keymap reformat 확인

var first: Int = 8
var second: Int = 2

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// - 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// - 반환값이 없는 함수 만들기
// 반환형 Unit == 아무것도 반환하지 않겠다 ** 생략가능!!
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// - 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

// - 가변인자를 갖는 함수 선언하는 방법
// vararg -> variable argument : 여러가지 인수를 받을 수 있다.
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}


fun main(array: Array<String>) {

    //함수를 호출하는 방법
    println(plus(first, second))

    // 인수를 명시적으로 전달하는 방법
    val result2 = plus(first = 20, second = 10)
    println(result2)

    val result3 = plus(second = 30, first = 15)
    println(result3)

    // 디폴트 값을 갖는 함수 호출하기
    println() //  한칸 띄우기
    val result4 = plusFive(50, 20)
    println(result4)
    val result5 = plusFive(10)
    println(result5)

    // 반환값을 갖지 않는 함수 호출하기
    println()
    printPlus(10, 40)

    // 간단한 함수
    println()
    val result6 = plusShort(50, 50)
    println(result6)

    // 가변인자 함수
    println()
    plusMany(1, 2, 3, 4, 5)
}