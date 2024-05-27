package com.ncgroup.data.teams.repository

import com.ncgroup.data.constants.BASE_URL
import com.ncgroup.data.teams.domain.Team
import com.ncgroup.data.teams.domain.TeamDriver

class TeamsRepositoryImpl : TeamsRepository{

    override fun getTeams(): List<Team> {
        return teams
    }

}

private val teams = listOf(
    Team(
        name = "Red Bull Racing",
        fullName = "Oracle Red Bull Racing",
        logoUrl = "$BASE_URL/teamLogo/red-bull-racing.png",
        carImageUrl = "$BASE_URL/cars/red-bull-racing.png",
        teamColour = "3671C6",
        drivers = listOf(
            TeamDriver(
                fullName = "Max Verstappen",
                driverNumber = 1,
                profileImageUrl = "$BASE_URL/profileImages/1.png"
            ),
            TeamDriver(
                fullName = "Sergio Perez",
                driverNumber = 11,
                profileImageUrl = "$BASE_URL/profileImages/11.png"
            )
        ),
        base = "Milton Keynes, United Kingdom",
        teamChief = "Christian Horner",
        technicalChief = "Pierre Waché",
        chassis = "RB20",
        powerUnit = "Honda RBPT",
        firstTeamEntry = 1997,
        worldChampionships = 6,
        highestRaceFinish = "1 (x118)",
        polePositions = 103,
        fastestLaps = 97
    ),
    Team(
        name = "Ferrari",
        fullName = "Scuderia Ferrari HP",
        logoUrl = "$BASE_URL/teamLogo/ferrari.png",
        carImageUrl = "$BASE_URL/cars/ferrari.png",
        teamColour = "E8002D",
        drivers = listOf(
            TeamDriver(
                fullName = "Charles Leclerc",
                driverNumber = 16,
                profileImageUrl = "$BASE_URL/profileImages/16.png"
            ),
            TeamDriver(
                fullName = "Carlos Sainz",
                driverNumber = 55,
                profileImageUrl = "$BASE_URL/profileImages/55.png"
            )
        ),
        base = "Maranello, Italy",
        teamChief = "Frédéric Vasseur",
        technicalChief = "Enrico Cardile / Enrico Gualtieri",
        chassis = "SF-24",
        powerUnit = "Ferrari",
        firstTeamEntry = 1950,
        worldChampionships = 16,
        highestRaceFinish = "1 (x245)",
        polePositions = 249,
        fastestLaps = 261
    ),
    Team(
        name = "McLaren",
        fullName = "McLaren Formula 1 Team",
        logoUrl = "$BASE_URL/teamLogo/mclaren.png",
        carImageUrl = "$BASE_URL/cars/mclaren.png",
        teamColour = "FF8000",
        drivers = listOf(
            TeamDriver(
                fullName = "Lando Norris",
                driverNumber = 4,
                profileImageUrl = "$BASE_URL/profileImages/4.png"
            ),
            TeamDriver(
                fullName = "Oscar Piastri",
                driverNumber = 81,
                profileImageUrl = "$BASE_URL/profileImages/81.png"
            )
        ),
        base = "Woking, United Kingdom",
        teamChief = "Andrea Stella",
        technicalChief = "Peter Prodromou / Neil Houldey",
        chassis = "MCL38",
        powerUnit = "Mercedes",
        firstTeamEntry = 1966,
        worldChampionships = 8,
        highestRaceFinish = "1 (x184)",
        polePositions = 157,
        fastestLaps = 166
    ),
    Team(
        name = "Mercedes",
        fullName = "Mercedes-AMG PETRONAS F1 Team",
        logoUrl = "$BASE_URL/teamLogo/mercedes.png",
        carImageUrl = "$BASE_URL/cars/mercedes.png",
        teamColour = "27F4D2",
        drivers = listOf(
            TeamDriver(
                fullName = "Lewis Hamilton",
                driverNumber = 44,
                profileImageUrl = "$BASE_URL/profileImages/44.png"
            ),
            TeamDriver(
                fullName = "George Russell",
                driverNumber = 63,
                profileImageUrl = "$BASE_URL/profileImages/63.png"
            )
        ),
        base = "Brackley, United Kingdom",
        teamChief = "Toto Wolff",
        technicalChief = "James Allison",
        chassis = "W15",
        powerUnit = "Mercedes",
        firstTeamEntry = 1970,
        worldChampionships = 8,
        highestRaceFinish = "1 (x116)",
        polePositions = 129,
        fastestLaps = 97
    ),
    Team(
        name = "Aston Martin",
        fullName = "Aston Martin Aramco F1 Team",
        logoUrl = "$BASE_URL/teamLogo/aston-martin.png",
        carImageUrl = "$BASE_URL/cars/aston-martin.png",
        teamColour = "229971",
        drivers = listOf(
            TeamDriver(
                fullName = "Fernando Alonso",
                driverNumber = 14,
                profileImageUrl = "$BASE_URL/profileImages/14.png"
            ),
            TeamDriver(
                fullName = "Lance Stroll",
                driverNumber = 18,
                profileImageUrl = "$BASE_URL/profileImages/18.png"
            )
        ),
        base = "Silverstone, United Kingdom",
        teamChief = "Mike Krack",
        technicalChief = "Dan Fallows",
        chassis = "AMR24",
        powerUnit = "Mercedes",
        firstTeamEntry = 2018,
        worldChampionships = 0,
        highestRaceFinish = "1 (x1)",
        polePositions = 1,
        fastestLaps = 2
    ),
    Team(
        name = "RB",
        fullName = "Visa Cash App RB Formula One Team",
        logoUrl = "$BASE_URL/teamLogo/rb.png",
        carImageUrl = "$BASE_URL/cars/rb.png",
        teamColour = "6692FF",
        drivers = listOf(
            TeamDriver(
                fullName = "Yuki Tsunoda",
                driverNumber = 22,
                profileImageUrl = "$BASE_URL/profileImages/22.png"
            ),
            TeamDriver(
                fullName = "Daniel Ricciardo",
                driverNumber = 3,
                profileImageUrl = "$BASE_URL/profileImages/3.png"
            )
        ),
        base = "Faenza, Italy",
        teamChief = "Laurent Mekies",
        technicalChief = "Jody Egginton",
        chassis = "VCARB 01",
        powerUnit = "Honda RBPT",
        firstTeamEntry = 1985,
        worldChampionships = 0,
        highestRaceFinish = "1 (x2)",
        polePositions = 1,
        fastestLaps = 3
    ),
    Team(
        name = "Haas",
        fullName = "MoneyGram Haas F1 Team",
        logoUrl = "$BASE_URL/teamLogo/haas.png",
        carImageUrl = "$BASE_URL/cars/haas.png",
        teamColour = "B6BABD",
        drivers = listOf(
            TeamDriver(
                fullName = "Nico Hulkenberg",
                driverNumber = 27,
                profileImageUrl = "$BASE_URL/profileImages/27.png"
            ),
            TeamDriver(
                fullName = "Kevin Magnussen",
                driverNumber = 20,
                profileImageUrl = "$BASE_URL/profileImages/20.png"
            )
        ),
        base = "Kannapolis, United States",
        teamChief = "Ayao Komatsu",
        technicalChief = "Andrea De Zordo",
        chassis = "VF-24",
        powerUnit = "Ferrari",
        firstTeamEntry = 2016,
        worldChampionships = 0,
        highestRaceFinish = "4 (x1)",
        polePositions = 1,
        fastestLaps = 2
    ),
    Team(
        name = "Alpine",
        fullName = "BWT Alpine F1 Team",
        logoUrl = "$BASE_URL/teamLogo/alpine.png",
        carImageUrl = "$BASE_URL/cars/alpine.png",
        teamColour = "FF87BC",
        drivers = listOf(
            TeamDriver(
                fullName = "Pierre Gasly",
                driverNumber = 10,
                profileImageUrl = "$BASE_URL/profileImages/10.png"
            ),
            TeamDriver(
                fullName = "Esteban Ocon",
                driverNumber = 31,
                profileImageUrl = "$BASE_URL/profileImages/31.png"
            )
        ),
        base = "Enstone, United Kingdom",
        teamChief = "Bruno Famin",
        technicalChief = "David Sanchez",
        chassis = "A524",
        powerUnit = "Renault",
        firstTeamEntry = 1986,
        worldChampionships = 2,
        highestRaceFinish = "1 (x21)",
        polePositions = 20,
        fastestLaps = 15
    ),
    Team(
        name = "Williams",
        fullName = "Williams Racing",
        logoUrl = "$BASE_URL/teamLogo/williams.png",
        carImageUrl = "$BASE_URL/cars/williams.png",
        teamColour = "64C4FF",
        drivers = listOf(
            TeamDriver(
                fullName = "Alexander Albon",
                driverNumber = 23,
                profileImageUrl = "$BASE_URL/profileImages/23.png"
            ),
            TeamDriver(
                fullName = "Logan Sargeant",
                driverNumber = 2,
                profileImageUrl = "$BASE_URL/profileImages/2.png"
            )
        ),
        base = "Grove, United Kingdom",
        teamChief = "James Vowles",
        technicalChief = "Pat Fry",
        chassis = "FW46",
        powerUnit = "Mercedes",
        firstTeamEntry = 1978,
        worldChampionships = 9,
        highestRaceFinish = "1 (x114)",
        polePositions = 128,
        fastestLaps = 133
    ),
    Team(
        name = "Kick Sauber",
        fullName = "Stake F1 Team Kick Sauber",
        logoUrl = "$BASE_URL/teamLogo/kick-sauber.png",
        carImageUrl = "$BASE_URL/cars/kick-sauber.png",
        teamColour = "52E252",
        drivers = listOf(
            TeamDriver(
                fullName = "Valtteri Bottas",
                driverNumber = 77,
                profileImageUrl = "$BASE_URL/profileImages/77.png"
            ),
            TeamDriver(
                fullName = "Guanyu Zhou",
                driverNumber = 24,
                profileImageUrl = "$BASE_URL/profileImages/24.png"
            )
        ),
        base = "Hinwil, Switzerland",
        teamChief = "Alessandro Alunni Bravi",
        technicalChief = "James Key",
        chassis = "C44",
        powerUnit = "Ferrari",
        firstTeamEntry = 1993,
        worldChampionships = 0,
        highestRaceFinish = "1 (x1)",
        polePositions = 1,
        fastestLaps = 7
    )
)