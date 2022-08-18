package com.priyam.kotlinrobotproject.model

import lombok.NoArgsConstructor

@NoArgsConstructor
data class MakeRobotRequest(
    val components: List<String>
)
