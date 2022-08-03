package com.abdykadyr.learningaboutcompose.domain.useCases

import com.abdykadyr.learningaboutcompose.domain.entities.Roll

class MakeRollUseCase(private val repository: Repository) {

    operator fun invoke() : Roll {
        return repository.makeRollUseCase()
    }

}