package com.ncgroup.data.teams.service

import com.ncgroup.data.teams.domain.Team
import com.ncgroup.data.teams.repository.TeamsRepository

class TeamsService (
    private val teamsRepository: TeamsRepository
) {
    fun getTeams(): List<Team> = teamsRepository.getTeams()
}