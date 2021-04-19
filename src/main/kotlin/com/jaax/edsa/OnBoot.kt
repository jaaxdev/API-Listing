package com.jaax.edsa

import com.jaax.edsa.entities.edsa.Cuenta
import com.jaax.edsa.entities.edsa.Email
import com.jaax.edsa.entities.edsa.Usuario
import com.jaax.edsa.services.edsa.CuentaService
import com.jaax.edsa.services.edsa.EmailService
import com.jaax.edsa.services.edsa.UsuarioService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class OnBoot(
    private val usuarioService: UsuarioService,
    private val emailService: EmailService,
    private val cuentaService: CuentaService
): ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val cuentas = listOf( Cuenta(
            type = "YouTube",
            password = "Password1",
            sourceEmail = "jaax@ja.mx"
        ) )
        if( !cuentaService.cuentaDAO.existsById(cuentas[0].type) ) { cuentaService.save(cuentas[0]) }

        val emails = listOf( Email(
            name = "jaax@ja.mx",
            password = "jajaja",
            nameUsuario = "Jaaziel",
            accounts = cuentas
        ) )
        if( !emailService.emailDAO.existsById(emails[0].name) ) { emailService.save(emails[0]) }

        listOf( Usuario(
            name = "Jaaziel",
            password = "jajaja",
            keyword = "key",
            emails = emails
        ) ).forEach {
            println( "Posting ${it.name}" )
            usuarioService.save( it )
        }
    }
}