package com.jaax.edsa.entities.student

import javax.persistence.*

@Entity
@Table( name = "alumnos" )
data class Alumno(
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    val number: Int = 0,
    var name: String = "",
    var lastNameP: String = "",
    var lastNameM: String = ""
)