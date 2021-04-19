package com.jaax.edsa.entities.student

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Alumno(
    @GeneratedValue( strategy = GenerationType.AUTO )
    val number: Int = 0,
    @Id
    var name: String = ""
)