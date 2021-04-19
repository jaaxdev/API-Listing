package com.jaax.edsa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EdsaApplication

fun main(args: Array<String>) {
	runApplication<EdsaApplication>(*args)
}
