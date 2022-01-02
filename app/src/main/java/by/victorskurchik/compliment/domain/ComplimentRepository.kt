package by.victorskurchik.compliment.domain

import by.victorskurchik.compliment.domain.models.Compliment
import kotlinx.coroutines.flow.StateFlow

interface ComplimentRepository {

    suspend fun getCompliment(): StateFlow<Compliment>
}