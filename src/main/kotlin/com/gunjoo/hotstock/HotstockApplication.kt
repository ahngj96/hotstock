package com.gunjoo.hotstock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HotStockApplication

fun main(args: Array<String>) {
    runApplication<HotStockApplication>(*args)
}
