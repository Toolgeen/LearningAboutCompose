package com.abdykadyr.learningaboutcompose.domain.entities

import com.abdykadyr.learningaboutcompose.domain.Dice

data class Roll(
    //dice roll pair contains dice and rolled value
    val diceRolls: List<Pair<Dice, Int?>>,
    val modifier: Int,
    val rollId: Int = ID_UNDEFINED
) {
    companion object {
        private const val ID_UNDEFINED = 0
    }
}
