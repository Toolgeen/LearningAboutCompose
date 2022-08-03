package com.abdykadyr.learningaboutcompose.domain.useCases

import com.abdykadyr.learningaboutcompose.domain.entities.Roll
import kotlinx.coroutines.flow.Flow

class GetListOfRollsUseCase(private val repository: Repository) {

    operator fun invoke() : Flow<List<Roll>> {
        return repository.getListOfRollsUseCase()
    }

}