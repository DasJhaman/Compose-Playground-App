package jhaman.das.playgroundapp.data

import jhaman.das.playgroundapp.domain.models.Users
import jhaman.das.playgroundapp.data.api.dto.UserDto


fun UserDto.toUser(): Users =
    Users(
        id = id,
        name = name,
        userName = userName,
        email = email
    )

fun List<UserDto>.toUsers() = map { it.toUser() }