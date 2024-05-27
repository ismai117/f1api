package com.ncgroup.routes

import com.ncgroup.data.drivers.service.DriversService
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject


fun Route.drivers(){

    val service by inject<DriversService>()

    get("/drivers") {
        call.respond(
            HttpStatusCode.OK,
            service.getDrivers()
        )
    }
}