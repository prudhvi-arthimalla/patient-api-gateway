package com.patient.management.api.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PatientApiGatewayApplication

fun main(args: Array<String>) {
	runApplication<PatientApiGatewayApplication>(*args)
}
