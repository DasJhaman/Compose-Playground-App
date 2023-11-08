package jhaman.das.playgroundapp.domain

import jhaman.das.playgroundapp.data.repo.UserRepository


class GetUsersListUseCase(private val userRepository: UserRepository) {
    suspend operator fun invoke() = userRepository.getUserList()
}