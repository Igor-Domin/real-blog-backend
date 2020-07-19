package com.domin.realblog.user

import org.springframework.web.bind.annotation.RestController


@RestController
class UserController(
    val repository: UserRepository,
    val service: UserService
) {

}