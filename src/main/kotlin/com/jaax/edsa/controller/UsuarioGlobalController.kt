package com.jaax.edsa.controller

import com.jaax.edsa.entities.UsuarioGlobal
import com.jaax.edsa.services.UsuarioGlobalService
import com.jaax.edsa.utils.Constantes
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping( Constantes.ENDPOINT_USUARIO_GLOBAL )
class UsuarioGlobalController(
    usuarioGlobalService: UsuarioGlobalService
): BasicController<UsuarioGlobal, String>(usuarioGlobalService)