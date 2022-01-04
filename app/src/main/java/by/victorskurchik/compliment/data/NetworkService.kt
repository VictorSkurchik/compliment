package by.victorskurchik.compliment.data

import by.victorskurchik.compliment.domain.models.Compliment
import retrofit2.http.GET

interface NetworkService {

    suspend fun getCompliment(): Compliment
}
