package com.jaax.edsa.services.shopping

import com.jaax.edsa.dao.ProductoDAO
import com.jaax.edsa.entities.shopping.Producto
import com.jaax.edsa.services.BasicCRUD
import org.springframework.dao.DuplicateKeyException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class ProductoService( val productoDAO: ProductoDAO ): BasicCRUD<Producto, String> {
    override fun findAll(): List<Producto> = productoDAO.findAll()

    override fun findById(id: String): Producto? = productoDAO.findByIdOrNull(id)

    override fun save(t: Producto): Producto {
        return if( !productoDAO.existsById(t.name) ) {
            productoDAO.save(t)
        } else {
            throw DuplicateKeyException( "${t.name} ya existe" )
        }
    }

    override fun update(t: Producto): Producto {
        return if( productoDAO.existsById(t.name) ) {
            productoDAO.save(t)
        } else {
            throw EntityNotFoundException( "${t.name} ya existe" )
        }
    }

    override fun deleteById(id: String): Producto {
        return this.findById(id)?.apply {
            this@ProductoService.productoDAO.deleteById(id)
        } ?: throw EntityNotFoundException( "${id} no existe" )
    }
}