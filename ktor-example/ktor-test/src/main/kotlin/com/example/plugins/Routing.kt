package com.example.plugins // ktlint-disable filename

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.ktor.server.application.* // ktlint-disable no-wildcard-imports
import io.ktor.server.routing.*
import java.io.File

// ktlint-disable no-wildcard-imports

fun Application.configureRouting() {
    // Starting point for a Ktor app:
    routing {
        get("/") {
            val mapper = jacksonObjectMapper()
            mapper.registerKotlinModule()
            mapper.registerModule(JavaTimeModule())

            val jsonString: String = File("./src/main/resources/questions.json").readText(Charsets.UTF_8)
            val jsonTextList = mapper.readValue<List<Question>>(jsonString)
            println(jsonTextList)
        }
    }
    routing {
    }
}

data class Questions(
    val questions: List<Question>
)

data class Question(
    val title: String,
    val options: List<String>
)
