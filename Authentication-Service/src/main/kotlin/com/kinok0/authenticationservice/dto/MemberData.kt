package com.kinok0.authenticationservice.dto

import com.kinok0.authenticationservice.entity.Role

data class MemberData(
    val login: String,
    val role: Role
)