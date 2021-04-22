package com.jaax.edsa.entities.edsa

import javax.persistence.*

@Entity
@Table( name = "cuentas" )
data class Cuenta(
    //@JoinColumn( name = "email_id" )
    @Id
    var type: String = "",
    var password: String = "",
    var emailID: String = ""
)