package com.jaax.edsa

import com.jaax.edsa.entities.UsuarioGlobal
import com.jaax.edsa.entities.edsa.Cuenta
import com.jaax.edsa.entities.edsa.Email
import com.jaax.edsa.entities.edsa.Usuario
import com.jaax.edsa.services.UsuarioGlobalService
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
    private val cuentaService: CuentaService,
    private val usuarioGlobalService: UsuarioGlobalService
): ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        /*val usuarios = listOf( Usuario(
            username = "Jaaziel",
            emails = null
        ) )
        val emails = listOf( Email(
            name = "jaax@ja.mx",
            password = "jajaja",
            usuario = usuarios[0]
        ) )
        val cuentas = listOf( Cuenta(
            type = "YouTube",
            password = "Password1",
            email = emails[0]
        ) )
        if( !cuentaService.cuentaDAO.existsById(cuentas[0].type) ) { cuentaService.save(cuentas[0]) }
        if( !emailService.emailDAO.existsById(emails[0].name) ) { emailService.save(emails[0]) }
        usuarios.forEach {
            println( "Posting ${it.username}" )
            usuarioService.save( it )
        }*/

        val usrglobal = UsuarioGlobal(
            name = "jaax",
            password = "jaax123",
            keyword = "jaaxkey"
        )
        if( !usuarioGlobalService.usuarioGlobalDAO.existsById(usrglobal.name) ){ usuarioGlobalService.save(usrglobal) }

    }
}