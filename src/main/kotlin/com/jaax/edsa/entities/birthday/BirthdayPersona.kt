package com.jaax.edsa.entities.birthday

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table( name = "birthdays" )
data class BirthdayPersona(
    @Id
    var name: String = "",
    var dateBirthday: Date? = null,
    var gift: String = ""
)