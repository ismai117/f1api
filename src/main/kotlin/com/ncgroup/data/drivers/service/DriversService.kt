package com.ncgroup.data.drivers.service

import com.ncgroup.data.drivers.domain.Driver
import com.ncgroup.data.drivers.repository.DriversRepository

class DriversService (
    private val driversRepository: DriversRepository
) {
    fun getDrivers(): List<Driver> = driversRepository.getDrivers()
}