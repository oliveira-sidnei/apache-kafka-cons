package br.com.kafkaprodpoc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApacheKafkaPocApplication

fun main(args: Array<String>) {
	runApplication<ApacheKafkaPocApplication>(*args)
}
