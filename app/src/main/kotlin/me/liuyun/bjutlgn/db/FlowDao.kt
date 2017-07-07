package me.liuyun.bjutlgn.db

import android.arch.persistence.room.*
import me.liuyun.bjutlgn.entity.Flow

/**
 * Created by Yun on 2017.7.6.
 */

@Dao
interface FlowDao {
    @Query("SELECT * FROM flow")
    fun all(): List<Flow>

    @Insert
    fun insert(flow: Flow)

    @Insert
    fun insertAll(vararg flows: Flow)

    @Update
    fun update(flow: Flow)

    @Delete
    fun delete(flow: Flow)

    @Query("DELETE FROM flow")
    fun deleteAll()
}