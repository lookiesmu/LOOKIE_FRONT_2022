package Kotlin

fun main(args: Array<String>){

    fun main(array: Array<String>) {
        /*
            코틀린이 좋은 이유
            - 문법이 간결하며, 표현력이 좋다
            - Null safe 언어 이다
            - 기존 라이브러리와 상호 운용성이 좋다. (자바와 100% 호환)
         */
        /*
            변수
                var / val 변수명(상자) = 값(넣고 싶은 것)
                var = Variable - 변수
                val = Value - 상수

                변수 선언하는 방법(1)
                Variable/Value 변수명 = 값
                var/val 변수명 = 값
                eg) var number = 10
                변수 선언하는 방법(2)
                var/val 변수 : 자료형 = 값
         */


        /*
            자료형
                정수형 -> Long > Int > Short > Byte
                실수형 -> Double > Float
                문자 -> Char
                문자열 -> String
                논리형 (True / False) -> Boolean
         */

        /*
            -함수
                -어떤 input 을 넣어주면 어떤 output이 나오는 것
                -y = x+2

            -함수를 선언하는 방법

                fun 함수명 (변수명:타입, 변수명 : 타입 ....) : 반환형 {
                    함수내용
                    return 반환값
                }
        */

        /*
            분기문
                //if/else 사용하는 방법(1)
                    val a: Int = 5
                    val b: Int = 10

                    if (a > b) {
                        println("a 가 b 보다 크다")
                    } else {
                        println("a가 b 보다 작다")
                    }
                    println("3번")

                //if/else 사용하는 방법 (2)

                    if (a > b)
                        println("a가 b 보다 크다")
                    else if (a < b)
                        println("a가 b 보다 작다")
                    else
                        println("a와 b는 같다")

                //값을 리턴하는 if 사용방법
                //if는 결과값도 return 할 수 있음.
                    val max = if(a > b) {
                        a
                    } else {
                        b
                    }

                //when 구문을 사용한 분기

                    val value : Int = 3
                    when(value){
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
                            println("I do not know value")
                        }
                    }
                    if (value == 1){
                        println("value is 1")
                    } else if (value == 2){
                        println("value is 2")
                    } else if (value == 3){
                        println("value is 2")
                    } else {
                        println("value is 2")
                    }

                    val value2 = when(value) {
                        1 -> 10
                        2 -> 20
                        3 -> 30
                        else -> 100
                    }
                    println(value2)
         */


        /*
            반복문

                val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)

            // 반복하는 방법 (1)
                for (item in a) { // 원하는 이름으로 지어줘도 댐
                    if (item == 5) {
                        println("item is Five")
                    } else {
                        println("item is not Five")
                    }
                }

            // 반복하는 방법 (2)
                for ((index, item) in a.withIndex()) {
                    println("index : " + index + " value : " + item)
                }

            // 반복하는 방법 (3)
                a.forEach {
                    println(it)
                }

            // 반복하는 방법 (4)
                a.forEach {item -> //굳이 여기 item이라는 값이 아니라 다른 이름으로 넣어도 됨
                    println(item)
                }

            // 반복하는 방법 (5)
                a.forEachIndexed { index, item ->
                    println("index : " + index + " value : " + item)
                }

            // 반복하는 방법 (6)
                for ( i in 0 until a.size){ // until 은 n-1 까지 출력
                    // 0부터 a.size - 1 까지 출력
                println(a.get(i))\
                }

            // 반복하는 방법 (7)
                for ( i in 0 until a.size step (2)) {
                    println(a.get(i))
                }

            //반복하는 방법 (8)
                for(i in a.size -1 downTo (0)) {
                    //index를 높은순에서 부터 접근
                    println(a.get(i))
                }

            //반복하는 방법 (9)
                for (i in a.size -1 downTo (0) step(2)) {
                    println(a.get(i))
                }

            //반복하는 방법 (10)
                for (i in 0..10) {
                    //until은 마지막을 포함하지 않지만 .. 은 마지막을 포함함.
                    println()
                }

            //반복하는 방법 (11)
                var b: Int = 0
                var c: Int = 4
                while (b < c) {
                    b++ // while문을 정지 시키기 위한 code
                    println("b")
                }

            //반복하는 방법 (12)
                do {
                    println("hello")
                } while (a < b)
            */
    }