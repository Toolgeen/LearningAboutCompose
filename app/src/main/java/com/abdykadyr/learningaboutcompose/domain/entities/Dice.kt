package com.abdykadyr.learningaboutcompose.domain

import kotlin.random.Random

sealed class Dice {

    val minValue = 0
    abstract val maxValue : Int

    fun rollDice() : Int {
        return Random.nextInt(minValue, maxValue)
    }
}

class D4Dice : Dice() {
    override val maxValue = 4
}

class D6Dice : Dice() {
    override val maxValue = 6
}

class D8Dice : Dice() {
    override val maxValue = 8
}

class D10Dice : Dice() {
    override val maxValue = 10
}

class D12Dice : Dice() {
    override val maxValue = 12
}

class D20Dice : Dice() {
    override val maxValue = 20
}

class D100Dice : Dice() {
    override val maxValue = 100
}