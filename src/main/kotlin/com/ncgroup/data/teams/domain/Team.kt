package com.ncgroup.data.teams.domain

import kotlinx.serialization.Serializable


@Serializable
data class Team(
    val name: String,
    val fullName: String,
    val logoUrl: String,
    val carImageUrl: String,
    val teamColour: String,
    val drivers: List<TeamDriver>,
    val base: String,
    val teamChief: String,
    val technicalChief: String,
    val chassis: String,
    val powerUnit: String,
    val firstTeamEntry: Int,
    val worldChampionships: Int,
    val highestRaceFinish: String,
    val polePositions: Int,
    val fastestLaps: Int,
)

@Serializable
data class TeamDriver(
    val fullName: String,
    val driverNumber: Int,
    val profileImageUrl: String
)