package com.abdykadyr.learningaboutcompose.domain.useCases

class GetRollUseCase(private val repository: Repository) {

operator fun invoke(rollId: Int) = repository.getRollUseCase(rollId)

}