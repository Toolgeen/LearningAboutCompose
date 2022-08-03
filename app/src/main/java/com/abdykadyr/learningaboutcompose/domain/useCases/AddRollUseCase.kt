package com.abdykadyr.learningaboutcompose.domain.useCases

import com.abdykadyr.learningaboutcompose.domain.entities.Roll

class AddRollUseCase(private val repository: Repository) {

    operator fun invoke(roll: Roll) = repository.addRollUseCase(roll)
}