package com.learningprometheus.service

import com.learningprometheus.domain.entity.City
import com.learningprometheus.repository.CityRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
data class CityService(
    private val cityRepository: CityRepository
) {
    @Transactional(readOnly = true)
    fun findAll(page: Pageable): Page<City> {
        return cityRepository.findAll(page)
    }
}
