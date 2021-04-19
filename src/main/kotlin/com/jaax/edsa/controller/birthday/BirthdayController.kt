package com.jaax.edsa.controller.birthday

import com.jaax.edsa.controller.BasicController
import com.jaax.edsa.entities.birthday.BirthdayPersona
import com.jaax.edsa.services.birthday.BirthdayService
import com.jaax.edsa.utils.Constantes
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping( Constantes.ENDPOINT_BIRTHDAY_PERSONA )
class BirthdayController( birthdayService: BirthdayService ): BasicController<BirthdayPersona, String>(birthdayService)