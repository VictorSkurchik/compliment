package by.victorskurchik.compliment.domain

import by.victorskurchik.compliment.domain.models.Compliment

interface ComplimentRepository {

    suspend fun getCompliment(): Compliment
}