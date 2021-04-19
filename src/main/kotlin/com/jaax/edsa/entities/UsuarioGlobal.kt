package com.jaax.edsa.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class UsuarioGlobal(
    @Id
    var name: String = "",
    @GeneratedValue
    val number: Long = 0,
    var password: String = "",
    var keyword: String = ""
)