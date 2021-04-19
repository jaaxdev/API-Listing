package com.jaax.edsa.controller.edsa

import com.jaax.edsa.controller.BasicController
import com.jaax.edsa.entities.edsa.Cuenta
import com.jaax.edsa.services.edsa.CuentaService
import com.jaax.edsa.utils.Constantes
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping( Constantes.ENDPOINT_EDSA_CUENTA )
class CuentaController( cuentaService: CuentaService): BasicController<Cuenta, String>(cuentaService)