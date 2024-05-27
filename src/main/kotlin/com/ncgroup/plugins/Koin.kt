package com.ncgroup.plugins

import com.ncgroup.data.drivers.di.driversModule
import com.ncgroup.data.teams.di.teamsModule
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin(){
    install(Koin){
        slf4jLogger()
        modules(
            teamsModule,
            driversModule
        )
    }
}