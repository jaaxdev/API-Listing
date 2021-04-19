package com.jaax.edsa.entities.shopping

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table( name = "productos" )
data class Producto(
    @Id
    var name: String = "",
    var brand: String = "",
    var description: String = ""
)