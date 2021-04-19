package com.jaax.edsa.services.birthday

import com.jaax.edsa.dao.BirthdayDAO
import com.jaax.edsa.entities.birthday.BirthdayPersona
import com.jaax.edsa.services.BasicCRUD
import org.springframework.dao.DuplicateKeyException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class BirthdayService( val birthdayDAO: BirthdayDAO ): BasicCRUD<BirthdayPersona, String> {
    override fun findAll(): List<BirthdayPersona> = birthdayDAO.findAll()

    override fun findById(id: String): BirthdayPersona? = birthdayDAO.findByIdOrNull(id)

    override fun save(t: BirthdayPersona): BirthdayPersona {
        return if( !birthdayDAO.existsById(t.name) ) {
            birthdayDAO.save(t)
        } else {
            throw DuplicateKeyException( "${t.name} ya existe" )
        }
    }

    override fun update(t: BirthdayPersona): BirthdayPersona {
        return if( birthdayDAO.existsById(t.name) ) {
            birthdayDAO.save(t)
        } else {
            throw EntityNotFoundException( "${t.name} no existe" )
        }
    }

    override fun deleteById(id: String): BirthdayPersona {
        return this.findById(id)?.apply {
            this@BirthdayService.birthdayDAO.deleteById(id)
        } ?: throw EntityNotFoundException( "$id no existe" )
    }
}