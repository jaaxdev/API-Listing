package com.jaax.edsa.entities.edsa

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table( name = "usuarios" )
data class Usuario(
    @Id
    var name: String = "",
    @OneToMany
    var emails: List<Email>? = null
)