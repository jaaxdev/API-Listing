package com.jaax.edsa.services.edsa

import com.jaax.edsa.dao.EmailDAO
import com.jaax.edsa.entities.edsa.Email
import com.jaax.edsa.services.BasicCRUD
import org.springframework.dao.DuplicateKeyException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class EmailService( val emailDAO: EmailDAO): BasicCRUD<Email, String> {
    override fun findAll(): List<Email> = emailDAO.findAll()

    override fun findById(id: String): Email? = emailDAO.findByIdOrNull(id)

    override fun save(t: Email): Email {
        return if( !emailDAO.existsById(t.name) ) {
            emailDAO.save(t)
        } else {
            throw DuplicateKeyException( "${t.name} ya existe" )
        }
    }

    override fun update(t: Email): Email {
        return if( emailDAO.existsById(t.name) ){
            emailDAO.save(t)
        } else {
            throw EntityNotFoundException( "${t.name} no existe" )
        }
    }

    override fun deleteById(id: String): Email {
        return this.findById(id)?.apply {
            this@EmailService.emailDAO.deleteById(id)
        } ?: throw EntityNotFoundException( "$id no existe" )
    }
}