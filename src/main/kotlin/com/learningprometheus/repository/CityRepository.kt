package com.learningprometheus.repository

import com.learningprometheus.domain.entity.City
import org.springframework.data.jpa.repository.JpaRepository

interface CityRepository : JpaRepository<City, Long>
