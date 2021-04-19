package com.jaax.edsa.services

import com.jaax.edsa.dao.UsuarioGlobalDAO
import com.jaax.edsa.entities.UsuarioGlobal
import org.springframework.dao.DuplicateKeyException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class UsuarioGlobalService( val usuarioGlobalDAO: UsuarioGlobalDAO ): BasicCRUD<UsuarioGlobal, String> {
    override fun findAll(): List<UsuarioGlobal> = usuarioGlobalDAO.findAll()

    override fun findById(id: String): UsuarioGlobal? = usuarioGlobalDAO.findByIdOrNull(id)

    override fun save(t: UsuarioGlobal): UsuarioGlobal {
        return if( !usuarioGlobalDAO.existsById(t.name) ) {
            usuarioGlobalDAO.save(t)
        } else {
            throw DuplicateKeyException( "${t.name} ya existe" )
        }
    }

    override fun update(t: UsuarioGlobal): UsuarioGlobal {
        return if( usuarioGlobalDAO.existsById(t.name) ) {
            usuarioGlobalDAO.save(t)
        } else {
            throw EntityNotFoundException( "${t.name} no existe" )
        }
    }

    override fun deleteById(id: String): UsuarioGlobal {
        return this.findById(id)?.apply {
            this@UsuarioGlobalService.usuarioGlobalDAO.deleteById(id)
        } ?: throw EntityNotFoundException( "$id no existe" )
    }

}