package com.gunjoo.hotstock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HotstockApplication

fun main(args: Array<String>) {
	runApplication<HotstockApplication>(*args)
}
