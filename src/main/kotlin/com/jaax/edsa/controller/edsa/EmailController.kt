package com.jaax.edsa.controller.edsa

import com.jaax.edsa.controller.BasicController
import com.jaax.edsa.entities.edsa.Email
import com.jaax.edsa.services.edsa.EmailService
import com.jaax.edsa.utils.Constantes
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping( Constantes.ENDPOINT_EDSA_EMAIL )
class EmailController( emailService: EmailService): BasicController<Email, String>(emailService)