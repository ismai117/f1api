package com.ncgroup.data.teams.repository

import com.ncgroup.data.teams.domain.Team

interface TeamsRepository {
    fun getTeams(): List<Team>
}