package by.victorskurchik.compliment.domain.usecases

import by.victorskurchik.compliment.domain.ComplimentRepository
import by.victorskurchik.compliment.domain.models.Compliment
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetComplimentUseCase @Inject constructor(
    private val repository: ComplimentRepository
) {

    suspend operator fun invoke(): Compliment {
        return repository.getCompliment()
    }
}
