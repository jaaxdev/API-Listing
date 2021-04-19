package com.jaax.edsa.entities.birthday

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class BirthdayPersona(
    @Id
    var name: String = "",
    var dateBirthday: Date? = null,
    var gift: String = ""
)