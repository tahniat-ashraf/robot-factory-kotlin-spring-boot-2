package com.priyam.kotlinrobotproject.repository

import com.priyam.kotlinrobotproject.constant.RobotPart
import com.priyam.kotlinrobotproject.model.StockItem
import org.springframework.stereotype.Repository
import java.math.BigDecimal

@Repository
class StockRepositoryImpl : StockRepository {

     override var stockMap = HashMap<String, StockItem>()

    init {
        val stock= mutableListOf(
            StockItem(code = "A",  price = BigDecimal("10.28"), 9, "Humanoid Face",  RobotPart.FACE),
            StockItem(code = "B",  price = BigDecimal("24.07"), 7, "Humanoid Face",  RobotPart.FACE),
            StockItem(code = "C",  price = BigDecimal("13.30"), 0, "Humanoid Face",  RobotPart.FACE),
            StockItem(code = "D",  price = BigDecimal("28.94"), 1, "Humanoid Face",  RobotPart.ARMS),
            StockItem(code = "E",  price = BigDecimal("12.39"), 3, "Humanoid Face",  RobotPart.ARMS),
            StockItem(code = "F",  price = BigDecimal("30.77"), 2, "Humanoid Face",  RobotPart.MOBILITY),
            StockItem(code = "G",  price = BigDecimal("55.13"), 15, "Humanoid Face",  RobotPart.MOBILITY),
            StockItem(code = "H",  price = BigDecimal("50.00"), 7, "Humanoid Face",  RobotPart.MOBILITY),
            StockItem(code = "I",  price = BigDecimal("90.12"), 92, "Humanoid Face",  RobotPart.MATERIAL),
            StockItem(code = "J",  price = BigDecimal("82.31"), 15, "Humanoid Face",  RobotPart.MATERIAL),
        )

        stock
            .forEach { item -> stockMap[item.code] = item }
    }


}