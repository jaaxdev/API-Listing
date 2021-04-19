package com.jaax.edsa.entities.student

import javax.persistence.*

@Entity
@Table( name = "alumnos" )
data class Alumno(
    @GeneratedValue( strategy = GenerationType.AUTO )
    val number: Int = 0,
    @Id
    var name: String = ""
)