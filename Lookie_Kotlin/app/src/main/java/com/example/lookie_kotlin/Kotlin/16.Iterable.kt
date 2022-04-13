package com.example.lookie_kotlin.Kotlin

// 16. Iterable

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법(1)
    // a가 끝날때까지 반복
    // a가 9까지 있으므로 9번 반복된다
    for (item in a) {
        if(item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }
    println()

    // 반복하는 방법(2)
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 아무거나 = 문자열
    }

    // 반복하는 방법(3)
    // 람다 문법
    // forEach의 각각의 값은 it에 담겨서 전달된다.
    a.forEach {
        println(it)
    }

    println()
    //반복하는 방법 (4)
    //it 대신에 다른 이름을 사용할 수 있다
    a.forEach { yeop->
        println(yeop)
    }

    // 반복하는 방법(5)
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)
    }

    // 반복하는 방법 (6)
    println(a.size)

    for ( i in 0 until a.size) {
        // **** until은 마지막을 포함하지 않는다
        // 0부터 8까지 !!
        println(a.get(i))
    }

    // 반복하는 방법 (7)
    // step만큼 점프 !!
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }

    // 반복하는 방법(8)
    for (i in a.size - 1 downTo (0)) {
        // 8부터 0까지 반복 거꾸로 !
        println(a.get(i))
    }

    // 반복하는 방법 (9)
    // downTo -> 거꾸로 내려온다1
    for (i in a.size -1 downTo (0) step (2)) {
        println(a.get(i))
    }

    // 반복하는 방법 (10)
    // ..은 until과 달리 마지막을 포함한다
    for (i in 0..10) {
        println(i)
    }

    // 반복하는 방법 (11)
    // while문
    // while() ()안에 식이 참일 동안 계속 반복된다
    // -> 즉 while이 조건이 깨질 수 있는 코드가 무조건 들어가야한다 아니면 무한루프
    var b: Int = 0
    var c: Int = 4

    while (b < c) {
        b++ // ****while문을 정지 시키기 위한 코드
        println("b")
    }

    // 반복하는 방법 (12)
    // do while 문
    // while의 조건식이 만족되지 않더라도 일단 한번은 실행된다.
    do {
        println("hello")
    } while (b < c)


}