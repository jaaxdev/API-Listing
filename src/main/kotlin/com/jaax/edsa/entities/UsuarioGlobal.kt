package com.jaax.edsa.entities

import javax.persistence.*

@Entity
@Table( name = "globaluser" )
data class UsuarioGlobal(
    @Id
    @Column( unique = true, name = "global_username" )
    var name: String = "",
    var password: String = "",
    var keyword: String = ""
)