package com.abdykadyr.learningaboutcompose.domain.useCases

class DeleteRollUseCase(private val repository: Repository) {

    operator fun invoke(rollId: Int) = repository.deleteRollUseCase(rollId)

}