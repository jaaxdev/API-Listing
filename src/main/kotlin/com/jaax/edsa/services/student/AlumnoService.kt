package com.jaax.edsa.services.student

import com.jaax.edsa.entities.student.Alumno
import com.jaax.edsa.dao.AlumnoDAO
import com.jaax.edsa.services.BasicCRUD
import org.springframework.dao.DuplicateKeyException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class AlumnoService( val alumnoDAO: AlumnoDAO ): BasicCRUD<Alumno, Int> {
    override fun findAll(): List<Alumno> = alumnoDAO.findAll()

    override fun findById(id: Int): Alumno? = alumnoDAO.findByIdOrNull(id)

    override fun save(t: Alumno): Alumno {
        return if( !alumnoDAO.existsById(t.number) ) {
            alumnoDAO.save(t)
        } else {
            throw DuplicateKeyException( "${t.name} ya existe" )
        }
    }

    override fun update(t: Alumno): Alumno {
        return if( alumnoDAO.existsById(t.number) ) {
            alumnoDAO.save(t)
        } else {
            throw EntityNotFoundException( "${t.number} ya existe" )
        }
    }

    override fun deleteById(id: Int): Alumno {
        return this.findById(id)?.apply {
            this@AlumnoService.alumnoDAO.deleteById(id)
        } ?: throw EntityNotFoundException( "$id no existe" )
    }
}