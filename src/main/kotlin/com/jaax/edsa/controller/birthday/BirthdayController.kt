package com.jaax.edsa.controller.birthday

import com.jaax.edsa.controller.BasicController
import com.jaax.edsa.entities.birthday.BirthdayPersona
import com.jaax.edsa.services.birthday.BirthdayService
import com.jaax.edsa.utils.Constantes
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping( Constantes.ENDPOINT_BIRTHDAY_PERSONA )
class BirthdayController( birthdayService: BirthdayService ): BasicController<BirthdayPersona, String>(birthdayService)