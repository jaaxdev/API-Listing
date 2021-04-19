package com.jaax.edsa.services.edsa

import com.jaax.edsa.dao.UsuarioDAO
import com.jaax.edsa.entities.edsa.Usuario
import com.jaax.edsa.services.BasicCRUD
import org.springframework.dao.DuplicateKeyException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class UsuarioService( val usuarioDAO: UsuarioDAO ): BasicCRUD<Usuario, String> {
    override fun findAll(): List<Usuario> = usuarioDAO.findAll()

    override fun findById(id: String): Usuario? = usuarioDAO.findByIdOrNull(id)

    override fun save(t: Usuario): Usuario {
        return if( !usuarioDAO.existsById(t.username) ) {
            usuarioDAO.save(t)
        } else {
            throw DuplicateKeyException( "${t.username} ya existe" )
        }
    }

    override fun update(t: Usuario): Usuario {
        return if( usuarioDAO.existsById(t.username) ){
            usuarioDAO.save(t)
        } else {
            throw EntityNotFoundException( "${t.username} no existe" )
        }
    }

    override fun deleteById(id: String): Usuario {
        return this.findById(id)?.apply {
            this@UsuarioService.usuarioDAO.deleteById(id)
        } ?: throw EntityNotFoundException( "$id no existe" )
    }
}