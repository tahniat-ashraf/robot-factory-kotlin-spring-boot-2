package com.priyam.kotlinrobotproject.repository

import com.priyam.kotlinrobotproject.model.StockItem
import org.springframework.stereotype.Repository

interface StockRepository {

    var stockMap : HashMap<String, StockItem>
}