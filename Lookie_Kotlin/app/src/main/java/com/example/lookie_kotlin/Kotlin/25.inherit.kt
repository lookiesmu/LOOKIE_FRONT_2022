package com.example.lookie_kotlin.Kotlin

// 두번까지는 봐준다
// 두번 이상이 넘어가면 리펙토링 해라

// 25. 상속
// 부모로부터 설명서를 물려받는다!

fun main(args: Array<String>) {

}


// open을 쓰는 이유
// class는 기본적으로 private 하기 때문에 상속을 해줄 수 없다
// 외부에서 접근할 수 없기 때문!
// 그래서 open을 써서 외부에서 접근할 수 있도록 해준다.

open class Car100(engine: String, body: String) {
    open fun drive() {

    }

    fun stop() {

    }
}