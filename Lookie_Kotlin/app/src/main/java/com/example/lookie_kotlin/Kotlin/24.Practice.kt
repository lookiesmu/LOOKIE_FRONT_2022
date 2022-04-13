package com.example.lookie_kotlin.Kotlin

// 어떤 클래스나 변수를 만들때 private, value로 만든다

fun main(array: Array<String>) {
    val night = Night(20, 4)
    val monster = Monster(15, 3)

    night.attack(monster)
    monster.attack(night)

    // 문제점
    // 기사의 체력을 마음대로 바꿔버릴 수 있다 ,, 버그,,
    // night.hp = 100

}

class Night(private var hp: Int, private var power: Int) {

    fun attack(monster: Monster) {
        monster.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            heal()
            println("기사의 현재 체력은 $hp 입니다")
        } else println("기사가 죽었습니다")

    }

    private fun heal() {
        // 아무때나 사용하는 것이 아니라
        // 공격을 당했을때 죽지 않으면 힐을 한다
        hp += 3
    }
}

class Monster(private var hp: Int, private var power: Int) {

    fun attack(night: Night) {
        night.defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("몬스터 현재 체력은 $hp 입니다")
        else println("몬스터가 죽었습니다")
    }
}