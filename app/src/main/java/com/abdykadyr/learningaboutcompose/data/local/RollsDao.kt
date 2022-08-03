package com.abdykadyr.learningaboutcompose.data.local

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface RollsDao {

    @Query("SELECT * FROM rolls_list WHERE rollId == :rollId")
    fun getRoll(rollId: Int): RollDbModel

    @Delete(entity = RollDbModel::class)
    fun deleteRoll(rollDbModel: RollDbModel)

    @Query("SELECT * FROM rolls_list ORDER BY rollId DESC")
    fun getAllRolls(): Flow<List<RollDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addRoll(rollDbModel: RollDbModel)

}