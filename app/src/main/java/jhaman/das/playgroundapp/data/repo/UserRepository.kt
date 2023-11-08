package jhaman.das.playgroundapp.data.repo

import jhaman.das.playgroundapp.data.api.UserApi
import jhaman.das.playgroundapp.data.toUsers
import jhaman.das.playgroundapp.domain.models.Users
import kotlinx.coroutines.flow.flow

class UserRepository(private val userApi: UserApi) {
    suspend fun getUserList() = flow<List<Users>> {
        userApi.getUsers().fold(onSuccess = {
            emit(it.toUsers())
        }, onFailure = {
            emit(emptyList())
        })
    }
}