package com.google.ar.core.examples.kotlin.helloar

data class StocksData(
    val afterHours: Double,
    val close: Double,
    val from: String,
    val high: Double,
    val low: Double,
    val `open`: Double,
    val preMarket: Double,
    val status: String,
    val symbol: String,
    val volume: Int
)