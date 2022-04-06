package com.example.myapplication.Kotlin

fun main(args:Array<String>){
    println("1번")
    //1번
    var firstList = mutableListOf<Int>()
    var secondList = mutableListOf<Boolean>()

    var i:Int = 0
    while (i<10){
        firstList.add(i)
        i++
    }
    i=0
    while (i<firstList.size){
        if(firstList[i] % 2 == 0){
            secondList.add(true)
        }
        else{
            secondList.add(false)
        }
        i++
    }
    println(firstList)
    println(secondList)

    println("2번")
    //2번
    val score = 90
    when(score){
        in 80..90 -> println("A")
        in 70..79 -> println("B")
        in 60..69 -> println("C")
        else -> println("F")

    }
    println("3번")
    //3번
    var tenNumber:Int = 52
    var sum:Int = 0
    while (tenNumber != 0){
        if (tenNumber>=10){
            sum += (tenNumber / 10)
            tenNumber %= 10
        }
        else{
            sum += tenNumber
            tenNumber %= 1
        }
    }
    println(sum)
    println("4번")
    //4번
    for (i in 1..9){
        for (j in 1..9){
            println("$i * $j = " + (i*j))
        }
    }
}