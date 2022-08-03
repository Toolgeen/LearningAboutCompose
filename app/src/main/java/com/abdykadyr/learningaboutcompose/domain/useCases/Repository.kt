package com.abdykadyr.learningaboutcompose.domain.useCases

import com.abdykadyr.learningaboutcompose.domain.entities.Roll
import kotlinx.coroutines.flow.Flow

interface Repository {

    fun addRollUseCase(roll : Roll)
    fun deleteRollUseCase(rollId: Int)
    fun getRollUseCase(rollId: Int): Roll
    fun makeRollUseCase() : Roll
    fun getListOfRollsUseCase() : Flow<List<Roll>>

}