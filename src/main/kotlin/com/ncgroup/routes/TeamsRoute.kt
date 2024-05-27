package com.ncgroup.routes

import com.ncgroup.data.teams.service.TeamsService
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.teams(){

    val service by inject<TeamsService>()

    get("/teams") {
        call.respond(
            HttpStatusCode.OK,
            service.getTeams()
        )
    }
}