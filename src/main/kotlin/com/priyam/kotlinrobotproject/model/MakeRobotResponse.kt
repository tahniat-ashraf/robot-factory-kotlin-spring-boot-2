package com.priyam.kotlinrobotproject.model

import java.math.BigDecimal
import java.util.UUID

data class MakeRobotResponse(
    var orderId: UUID,
    var total: BigDecimal
)