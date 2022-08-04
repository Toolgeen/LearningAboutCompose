package com.abdykadyr.learningaboutcompose.domain.useCases

import com.abdykadyr.learningaboutcompose.domain.Dice
import com.abdykadyr.learningaboutcompose.domain.entities.Roll
import kotlinx.coroutines.flow.Flow

interface Repository {

    suspend fun addRollUseCase(roll : Roll)
    suspend fun deleteRollUseCase(rollId: Int)
    suspend fun getRollUseCase(rollId: Int): Roll
    fun makeRollUseCase(dices: List<Dice>, rollModifier: Int) : Roll
    suspend fun getListOfRollsUseCase() : Flow<List<Roll>>

}