package com.jaax.edsa.controller

import com.jaax.edsa.entities.UsuarioGlobal
import com.jaax.edsa.services.UsuarioGlobalService
import com.jaax.edsa.utils.Constantes
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping( Constantes.ENDPOINT_USUARIO_GLOBAL )
class UsuarioGlobalController(
    usuarioGlobalService: UsuarioGlobalService
): BasicController<UsuarioGlobal, String>(usuarioGlobalService)