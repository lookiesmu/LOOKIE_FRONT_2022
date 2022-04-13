package com.example.lookie_kotlin.Kotlin

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4)
    println(a)
    a.add(0, 100)
    println(a)
    a.set(0, 200) // 0번째 index에 있는 값을 200으로 바꿈
    println(a)
    a.removeAt(1) // index로 삭제
    println(a)

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    println()
    b.add(2)
    println(b)
    b.remove(2) // element로 삭제
    println(b)
    b.remove(100) // 없는 값이면 무시

    val c = mutableMapOf<String, Int>("one" to 1)
    println()
    c.put("two", 2)
    println(c)
    c.replace("two", 3)
    println(c)
    println(c.keys) // key만 출력
    println(c.values) // value만 출력
    c.clear() // 전부 다 삭제
    println(c)


}