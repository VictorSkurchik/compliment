package by.victorskurchik.compliment.data

import by.victorskurchik.compliment.domain.ComplimentRepository
import by.victorskurchik.compliment.domain.models.Compliment
import kotlinx.coroutines.flow.StateFlow

class ComplimentRepositoryImpl(private val network: MainNetwork) : ComplimentRepository {

    override suspend fun getCompliment(): StateFlow<Compliment> {
        return network.getCompliment()
    }
}