package com.jaax.edsa

import com.jaax.edsa.entities.edsa.Cuenta
import com.jaax.edsa.entities.edsa.Email
import com.jaax.edsa.services.edsa.CuentaService
import com.jaax.edsa.services.edsa.EmailService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class OnBoot: ApplicationRunner {

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
    }
}