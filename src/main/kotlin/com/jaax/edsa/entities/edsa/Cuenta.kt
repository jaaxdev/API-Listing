package com.jaax.edsa.entities.edsa

import javax.persistence.*

@Entity
@Table( name = "cuentas" )
data class Cuenta(
    @ManyToOne( fetch = FetchType.LAZY, optional = false )
    @JoinColumn( name = "email_id" )
    val email: Email? = null,
    @Id
    var type: String = "",
    var password: String = ""
)