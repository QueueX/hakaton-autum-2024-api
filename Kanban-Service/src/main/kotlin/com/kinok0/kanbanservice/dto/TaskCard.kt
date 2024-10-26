package com.kinok0.kanbanservice.dto

import java.util.*

data class TaskCard(
    var id: UUID,
    var name: String,
    var htmlName: String,
    var employee: String?
)