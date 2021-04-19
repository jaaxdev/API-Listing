package com.jaax.edsa.controller.edsa

import com.jaax.edsa.controller.BasicController
import com.jaax.edsa.entities.edsa.Usuario
import com.jaax.edsa.services.edsa.UsuarioService
import com.jaax.edsa.utils.Constantes
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping( Constantes.ENDPOINT_EDSA_USUARIO )
class UsuarioController( usuarioService: UsuarioService): BasicController<Usuario, String>(usuarioService)