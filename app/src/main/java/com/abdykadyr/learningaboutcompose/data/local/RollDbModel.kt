package com.abdykadyr.learningaboutcompose.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.abdykadyr.learningaboutcompose.domain.Dice

@Entity(tableName = "rolls_list")
data class RollDbModel(
    //dice roll pair contains dice and rolled value
    val diceRolls: List<Pair<Dice, Int?>>,
    val modifier: Int,

    @PrimaryKey(autoGenerate = true)
    val rollId: Int
)
