package com.example.data.datasource.local

import com.example.data.datasource.ResultDataSource
import com.example.data.datasource.local.db.TestSeekeriTunesDatabase
import com.example.data.entity.ResultEntity

class LocalResultDataSource(private val database: TestSeekeriTunesDatabase) : ResultDataSource {
    override suspend fun saveResult(resultEntity: ResultEntity) {
        val entity = database.resultDao().getByTrackId(resultEntity.trackId)

        if (entity.trackId == resultEntity.trackId) {
            database.resultDao().update(resultEntity)
        } else {
            database.resultDao().insert(resultEntity)
        }
    }

    override suspend fun getResultsByTerm(term: String): List<ResultEntity> {
        val termEntity = database.termDao().getByText(term)
        return database.resultDao().getByTeem(termEntity.id)
    }
}