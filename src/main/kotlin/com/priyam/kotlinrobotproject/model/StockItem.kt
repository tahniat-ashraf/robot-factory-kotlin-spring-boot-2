package com.priyam.kotlinrobotproject.model

import com.priyam.kotlinrobotproject.constant.RobotPart
import java.math.BigDecimal

data class StockItem(
    var code : String,
    var price : BigDecimal,
    var availability : Int,
    var partDesc : String,
    var type : RobotPart
) {

}