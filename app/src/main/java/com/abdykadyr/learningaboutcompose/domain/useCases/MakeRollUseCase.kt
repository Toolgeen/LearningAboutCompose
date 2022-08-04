package com.abdykadyr.learningaboutcompose.domain.useCases

import com.abdykadyr.learningaboutcompose.domain.Dice
import com.abdykadyr.learningaboutcompose.domain.entities.Roll

class MakeRollUseCase(private val repository: Repository) {

    operator fun invoke(dices: List<Dice>, rollModifier: Int) : Roll {
        return repository.makeRollUseCase(dices, rollModifier)
    }

}