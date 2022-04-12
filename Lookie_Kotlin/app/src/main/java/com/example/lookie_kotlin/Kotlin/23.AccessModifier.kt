package com.example.lookie_kotlin.Kotlin

// 23. 접근 제어자

fun main(array: Array<String>) {

    val testAccess: TestAccess = TestAccess("아무개")

    // private 키워드 때문에 더 이상 외부에서 사용할 수 없다.
    //testAccess.test()
    //println(testAccess.name)
    //testAccess.name = "아무게 투"
    //println(testAccess.name)

    val reward: Reward = Reward()
    reward.rewardAmount = 2000

    val runningCar: RunningCar = RunningCar()

}

class Reward() {
    var rewardAmount: Int = 1000
}

class TestAccess {

    //private -> class 밖에서 변수에 접근하는 것을 허용하지 않음
    private var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    fun changeName(newName: String) {
        this.name = newName
    }

    fun test() {
        println("테스트")
    }
}

class RunningCar() {

    fun runFast() {
        run()
    }

    private fun run() {
        // 외부에 공개하고 싶지 않은 기능
        // 외부와 단절시켜주는 역할 !
        // runFast를 보조
    }
}