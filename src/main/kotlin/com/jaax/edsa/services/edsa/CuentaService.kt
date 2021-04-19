package com.jaax.edsa.services.edsa

import com.jaax.edsa.dao.CuentaDAO
import com.jaax.edsa.entities.edsa.Cuenta
import com.jaax.edsa.services.BasicCRUD
import org.springframework.dao.DuplicateKeyException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class CuentaService( val cuentaDAO: CuentaDAO): BasicCRUD<Cuenta, String> {
    override fun findAll(): List<Cuenta> = cuentaDAO.findAll()

    override fun findById(id: String): Cuenta? = cuentaDAO.findByIdOrNull(id)

    override fun save(t: Cuenta): Cuenta {
        return if( !cuentaDAO.existsById(t.type) ) {
            cuentaDAO.save(t)
        } else {
            throw DuplicateKeyException( "${t.type} ya existe" )
        }
    }

    override fun update(t: Cuenta): Cuenta {
        return if( cuentaDAO.existsById(t.type) ){
            cuentaDAO.save(t)
        } else {
            throw EntityNotFoundException( "${t.type} no existe" )
        }
    }

    override fun deleteById(id: String): Cuenta {
        return this.findById(id)?.apply {
            this@CuentaService.cuentaDAO.deleteById(id)
        } ?: throw EntityNotFoundException( "$id no existe" )
    }
}