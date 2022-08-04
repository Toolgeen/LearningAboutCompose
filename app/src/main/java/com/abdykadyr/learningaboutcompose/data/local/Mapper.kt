package com.abdykadyr.learningaboutcompose.data.local

import com.abdykadyr.learningaboutcompose.domain.entities.Roll
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class Mapper {

    fun mapDbModelToEntity(rollDbModel: RollDbModel): Roll {
        return Roll(
            rollId = rollDbModel.rollId,
            diceRolls = rollDbModel.diceRolls,
            rollModifier = rollDbModel.rollModifier
        )
    }

    fun mapEntityToDbModel(roll: Roll): RollDbModel {
        return RollDbModel(
            rollId = roll.rollId,
            diceRolls = roll.diceRolls,
            rollModifier = roll.rollModifier
        )
    }

    fun mapDbModelListToEntityList(rollDbModelList: Flow<List<RollDbModel>>): Flow<List<Roll>> {

        return rollDbModelList.map {
            it.map { rollDbModel ->
                mapDbModelToEntity(rollDbModel)
            }
        }
    }

}