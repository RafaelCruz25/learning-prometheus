package com.learningprometheus.controller

import com.learningprometheus.domain.entity.City
import com.learningprometheus.service.CityService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("cities")
class CityController(
    private val cityService: CityService
) {

    @GetMapping
    fun findAll(page: Pageable): ResponseEntity<Page<City>> {
        val list = cityService.findAll(page)
        return ResponseEntity.ok(list)
    }
}