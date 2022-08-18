package com.priyam.kotlinrobotproject.service

import com.priyam.kotlinrobotproject.model.StockItem
import com.priyam.kotlinrobotproject.model.MakeRobotRequest
import com.priyam.kotlinrobotproject.model.MakeRobotResponse
import com.priyam.kotlinrobotproject.repository.StockRepository
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.util.UUID

@Service
class StockServiceImpl(
    private val stockRepository: StockRepository
) : StockService {

    override fun getStock(): Map<String, StockItem> {
        return stockRepository.stockMap
    }

    override fun makeRobot(commands: MakeRobotRequest): MakeRobotResponse {

        var total = BigDecimal.ZERO
        val stock = getStock()

        for ( command in commands.components ){
            val stockItem = stock[command]
            if (stockItem!=null && stockItem.availability>=1) {
                //reserve
                stockItem.availability--
                total = total.add(stockItem.price)
            }
            else {
                throw RuntimeException("Invalid command / Item not available")
            }
        }

        return MakeRobotResponse(orderId = UUID.randomUUID(), total = total)

    }
}