package by.victorskurchik.compliment.data

import by.victorskurchik.compliment.domain.ComplimentRepository
import by.victorskurchik.compliment.domain.models.Compliment
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ComplimentRepositoryImpl @Inject constructor(
    private val network: NetworkService
) : ComplimentRepository {

    override suspend fun getCompliment(): Compliment {
        return network.getCompliment()
    }
}