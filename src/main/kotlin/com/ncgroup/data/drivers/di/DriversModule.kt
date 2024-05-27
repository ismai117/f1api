package com.ncgroup.data.drivers.di

import com.ncgroup.data.drivers.repository.DriversRepository
import com.ncgroup.data.drivers.repository.DriversRepositoryImpl
import com.ncgroup.data.drivers.service.DriversService
import org.koin.dsl.module

val driversModule = module {
    single<DriversRepository> { DriversRepositoryImpl() }
    single { DriversService(get()) }
}