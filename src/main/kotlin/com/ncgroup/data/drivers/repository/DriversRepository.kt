package com.ncgroup.data.drivers.repository

import com.ncgroup.data.drivers.domain.Driver

interface DriversRepository {
    fun getDrivers(): List<Driver>
}