package com.example.lookie_kotlin.Kotlin

// 2) 은행계좌 만들기

fun main(array: Array<String>) {

}

class CreateAccount {
    var name: String = ""
    var birthday: Int = 0
    var account: Int = 0
    var money: Int = 0

    constructor(name: String, birthday: Int, account: Int) {
        this.name = name
        this.birthday = birthday
        this.account = account
    }

    var map1 = mutableMapOf<String, Int>(name to birthday)
    var map2 = mutableMapOf<Int, Int>(account to money)
    var map3 = mutableMapOf<String, Int>(name to account)

    fun create(): Int {
        println(name + "님의 계좌번호는" + account + "입니다")
        return account
    }

}

class CheckAccount {

    var accountNum: Int = 0

    constructor(accountNum: Int) {
        this.accountNum = accountNum

    }

    fun check() {

    }


}

class Withdraw {

}

class Deposit {

}