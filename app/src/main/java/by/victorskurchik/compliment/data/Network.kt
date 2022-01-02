package by.victorskurchik.compliment.data

import by.victorskurchik.compliment.domain.models.Compliment
import kotlinx.coroutines.flow.StateFlow
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.http.GET

private val service: MainNetwork by lazy {

    val okHttpClient = OkHttpClient.Builder()
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl("http://localhost/")
        .client(okHttpClient)
        .build()

    retrofit.create(MainNetwork::class.java)
}

fun getNetworkService() = service

interface MainNetwork {

    @GET("URL") // TODO: add url
    suspend fun getCompliment(): StateFlow<Compliment>
}
