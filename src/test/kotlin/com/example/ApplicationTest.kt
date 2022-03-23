package com.example

import io.ktor.features.*
import org.slf4j.event.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.serialization.*
import io.ktor.application.*
import io.ktor.response.*
import kotlin.test.*
import io.ktor.server.testing.*
import com.example.plugins.*

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication(moduleFunction = Application::module) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,  // HttpStatusCode.BadRequest
                    actual = response.status()
                )
                assertEquals(expected = "Welcome to Boruto API!", // expected = "Hello",
                actual = response.content)
            }
        }
    }
}