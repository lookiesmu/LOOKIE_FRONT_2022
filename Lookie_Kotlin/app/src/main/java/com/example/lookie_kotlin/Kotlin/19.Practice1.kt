package com.example.lookie_kotlin.Kotlin

// 사칙 연산을 수행할 수 있는 클래스

fun main(array: Array<String>) {

    var a: Int = 100
    var b: Int = 13

    var calculator: Calculator = Calculator(a, b)
    calculator.plus()
    calculator.minus()
    calculator.multiply()
    calculator.divide()

    val calculator3 = Calculator3(3)
    calculator3.plus(5).minus(2)
    // 반환형을 class 로 하면 계속 기능을 이어갈 수 있다
    // -> Chaining(체이닝)

}

class Calculator {

    var a: Int = 0
    var b: Int = 0

    constructor(a: Int, b: Int) {
        this.a = a
        this.b = b
    }

    init {
        println("사칙연산 결과 : ")
    }

    fun plus() {
        println(a + b)
    }

    fun minus() {
        println(a - b)
    }

    fun multiply() {
        println(a * b)
    }

    fun divide() {
        println("몫 : " + a / b)
        println("나머지 : " + a % b)
    }

}

class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var result = 0
        numbers.forEach {
            result += it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = 0
        for(i in 0 until numbers.size) {
            result = result - numbers[i]
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result *= it
            }
        }
        return result
    }
}

class Calculator3(val initialValue: Int) {

    fun plus(number: Int) : Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int): Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3 {
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }




    }

