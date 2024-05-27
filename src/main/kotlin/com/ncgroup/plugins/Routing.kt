package com.ncgroup.plugins

import com.ncgroup.routes.drivers
import com.ncgroup.routes.teams
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        teams()
        drivers()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
