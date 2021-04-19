package com.jaax.edsa.entities.edsa

import javax.persistence.*

@Entity
@Table( name = "usuarios" )
data class Usuario(
    @Id
    var username: String = "",
    @OneToMany( mappedBy = "usuario", fetch = FetchType.LAZY )
    var emails: MutableList<Email>? = null
)