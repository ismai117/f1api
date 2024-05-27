package com.ncgroup.data.teams.di

import com.ncgroup.data.teams.repository.TeamsRepository
import com.ncgroup.data.teams.repository.TeamsRepositoryImpl
import com.ncgroup.data.teams.service.TeamsService
import org.koin.dsl.module

val teamsModule = module {
    single<TeamsRepository> { TeamsRepositoryImpl() }
    single { TeamsService(get()) }
}