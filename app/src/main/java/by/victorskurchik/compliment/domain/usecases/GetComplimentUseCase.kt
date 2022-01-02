package by.victorskurchik.compliment.domain.usecases

import by.victorskurchik.compliment.domain.ComplimentRepository
import by.victorskurchik.compliment.domain.models.Compliment
import kotlinx.coroutines.flow.StateFlow

class GetComplimentUseCase(
    private val repository: ComplimentRepository
) {

    suspend operator fun invoke(): StateFlow<Compliment> {
        return repository.getCompliment()
    }
}
