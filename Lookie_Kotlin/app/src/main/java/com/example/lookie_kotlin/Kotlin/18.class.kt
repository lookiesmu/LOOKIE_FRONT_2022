package com.example.lookie_kotlin.Kotlin

// 18. Class

// OOP -> Object Oriented Programming (객체지향 프로그래밍)

// 객체란 뭘까?
// - 이름이 있는 모든 것

// 절차지향 프로그래밍
// - 코드를 위에서부터 아래로 실행을 하면 문제가 해결된다

// 객체지향 프로그래밍의 문제 해결 방법
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다
// - 선수, 심판, 경기장, 관중 -> 축구게임

// 객체를 만드는 방법
// - 설명서가(클래스) 있어야 함

fun main(array: Array<String>) {

    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")

    val bigCar = Car("v8 engine", "big")

    // 우리가 만든 클래스(설명서)는 자료형이 된다
    // C언어 구조체?
    val bigcar: Car = Car("v8 engine", "big")

    val superCar: SuperCar = SuperCar("good engine", "big", "white")
    //constructer로 전달된다

    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    val runnableCar: RunnableCar = RunnableCar("simple engine", "short body")
    // RunnableCar.ride() -> 불가능
    // RunnableCar는 단지 설명서일 뿐. ride라는 기능이 있는 것은 아니다!
    runnableCar.ride()
    runnableCar.navi("부산")
    runnableCar.drive()

    // 인스턴스의 멤버 변수에 접근하는 방법
    val runnableCar2: RunnableCar2 = RunnableCar2("nice engine", "long body")
    println(runnableCar2.body)
    println(runnableCar2.engine)

    println()
    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1, 2)

}

// 클래스(설명서) 만드는 방법 (1)
class Car(var engine: String, var body: String) {

}

// 클래스(설명서) 만드는 방법 (2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    // main에서 constructor로 전달된 값을 다시 클래스에 전달해준다
    // this.engine이 SuperCar의 engine
    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법 (3) -> 1번 방법의 확장
// engine과 body는 반드시 필요한 것
// door는 추가로 필요한 것
// class 옆에 바로 적어주는 constructor는 반드시 필요한 것을 적어줌
// class 내에 있는 constructor는 추가적으로 필요한 것을 적어줌

class Car1 constructor(engine: String, body: String) {
    var door: String = ""

    //생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(4) -> 2번 방법의 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunnableCar(engine: String, body: String) {

    fun ride() {
        println("탑승하였습니다")
    }

    fun drive() {
        println("달립니다!")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

class RunnableCar2 {
    var engine: String = ""
    var body: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    // init은 class를 통해서 실제 객체가 만들어질때, 즉 인스턴스화 될때
    // 가장 먼저 무조건 호출됨
    init {
        // 활용방법 : 초기세팅을 할 때 유용하다
        println("RubbableCar2가 생성되었습니다 !")
    }

    fun ride() {
        println("탑승하였습니다")
    }

    fun drive() {
        println("달립니다!")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
}

// 오버로딩
// 클래스 안에 이름이 같은 기능이 존재할 수 없다
// 변수도 마찬가지로 이름이 같은 것이 두 개 이상 존재할 수 없다
// 함수의 경우 이름이 같아도 받는 인자가 다르면 사용할 수 있다! -> 오버로딩 한다고 표현

class TestClass() {

    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
        println("down")
    }
}