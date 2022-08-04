package com.abdykadyr.learningaboutcompose.data

import android.app.Application
import com.abdykadyr.learningaboutcompose.data.local.AppDatabase
import com.abdykadyr.learningaboutcompose.data.local.Mapper
import com.abdykadyr.learningaboutcompose.domain.Dice
import com.abdykadyr.learningaboutcompose.domain.entities.Roll
import com.abdykadyr.learningaboutcompose.domain.useCases.Repository
import kotlinx.coroutines.flow.Flow

class RepositoryImpl(application: Application) : Repository {

    private val rollsDao = AppDatabase.getInstance(application).rollsDao()
    private val mapper = Mapper()

    override suspend fun addRollUseCase(roll: Roll) {
        rollsDao.addRoll(mapper.mapEntityToDbModel(roll))
    }

    override suspend fun deleteRollUseCase(rollId: Int) {
        rollsDao.deleteRoll(mapper.mapEntityToDbModel(getRollUseCase(rollId)))
    }

    override suspend fun getRollUseCase(rollId: Int): Roll {
        return mapper.mapDbModelToEntity(rollsDao.getRoll(rollId))
    }

    override fun makeRollUseCase(dices: List<Dice>, rollModifier: Int): Roll {
        val diceRolls = mutableListOf<Pair<Dice, Int>>()
        dices.map {
            diceRolls.add(Pair(it,it.rollDice()))
        }
        return Roll(
            diceRolls = diceRolls,
            rollModifier = rollModifier
        )
    }


    override suspend fun getListOfRollsUseCase(): Flow<List<Roll>> {
        return mapper.mapDbModelListToEntityList(rollsDao.getAllRolls())
    }


}