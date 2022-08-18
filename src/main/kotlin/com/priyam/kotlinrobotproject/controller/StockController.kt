package com.priyam.kotlinrobotproject.controller

import com.priyam.kotlinrobotproject.model.StockItem
import com.priyam.kotlinrobotproject.model.MakeRobotRequest
import com.priyam.kotlinrobotproject.model.MakeRobotResponse
import com.priyam.kotlinrobotproject.service.StockService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class StockController(
    private val stockService: StockService
) {

    @GetMapping("/")
    fun getStock(): ResponseEntity<Map<String, StockItem>> {
        val stock =  stockService.getStock()
        return ResponseEntity(stock, HttpStatus.OK)
    }

    @PostMapping("/makeRobot")
    fun makeRobot(@RequestBody commands : MakeRobotRequest) : ResponseEntity<MakeRobotResponse>{
        val makeRobotResponse =  stockService.makeRobot(commands)
        return ResponseEntity(makeRobotResponse, HttpStatus.CREATED)
    }
}