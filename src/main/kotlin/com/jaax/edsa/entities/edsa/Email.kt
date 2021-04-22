package com.jaax.edsa.entities.edsa

import javax.persistence.*
import javax.validation.constraints.Email

@Entity
@Table( name = "emails" )
data class Email(
    @Id
    @get:Email
    var name: String = "",
    var password: String = "",
    var username: String = ""
    //@OneToMany( mappedBy = "email", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    //@JoinColumn( name = "email_id", referencedColumnName = "name" )
    //var accounts: MutableList<Cuenta>? = null
)