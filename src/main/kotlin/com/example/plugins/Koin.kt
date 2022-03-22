package com.example.plugins

import com.example.di.koinModule
import io.ktor.application.*
import org.koin.ktor.ext.Koin
import org.koin.logger.slf4jLogger
import org.slf4j.event.Level

fun Application.configureKoin(){
    install(Koin){
        slf4jLogger(level = Level.ERROR)
        modules(koinModule)
    }
}

fun slf4jLogger(level: Level) {

}
