package com.jaax.edsa.entities.edsa

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table
import javax.validation.constraints.Email

@Entity
@Table( name = "emails" )
data class Email(
    @Id
    @get:Email
    var name: String = "",
    var password: String = "",
    var nameUsuario: String = "",
    @OneToMany
    var accounts: List<Cuenta>? = null
)