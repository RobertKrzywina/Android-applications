package pl.robert.server.user.domain.dto

data class UserDto(
        var uuid: String,
        var email: String,
        var firstName: String,
        var lastName: String,
        var age: Int
)
