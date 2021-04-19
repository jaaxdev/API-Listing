package com.jaax.edsa.entities.edsa

import javax.persistence.*

@Entity
@Table( name = "cuentas" )
data class Cuenta(
    @Id
    var type: String = "",
    var password: String = "",
    var sourceEmail: String = ""
)