package com.priyam.kotlinrobotproject.service

import com.priyam.kotlinrobotproject.model.StockItem
import com.priyam.kotlinrobotproject.model.MakeRobotRequest
import com.priyam.kotlinrobotproject.model.MakeRobotResponse
import org.springframework.stereotype.Service

interface StockService {
     fun getStock() : Map<String, StockItem>

     fun makeRobot(commands : MakeRobotRequest) : MakeRobotResponse
}