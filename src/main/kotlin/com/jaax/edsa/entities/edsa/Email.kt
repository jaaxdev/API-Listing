package com.jaax.edsa.entities.edsa

import javax.persistence.*
import javax.validation.constraints.Email

@Entity
@Table( name = "emails" )
data class Email(
    @ManyToOne( fetch = FetchType.LAZY, optional = false )
    @JoinColumn( name = "usuario_id" )
    val usuario: Usuario? = null,
    @Id
    @get:Email
    var name: String = "",
    var password: String = "",
    @OneToMany( mappedBy = "email", fetch = FetchType.LAZY )
    var accounts: MutableList<Cuenta>? = null
)