package jhaman.das.playgroundapp.data.api

import jhaman.das.playgroundapp.data.api.dto.UserDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class UserApi(private val ktorClient: HttpClient) {
    suspend fun getUsers(): Result<List<UserDto>> = runCatching {
        ktorClient.get("users") {
        }.body()
    }
}