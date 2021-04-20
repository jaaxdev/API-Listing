package com.jaax.edsa.controller

import com.jaax.edsa.services.BasicCRUD
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

abstract class BasicController<T, ID>( private val basicCRUD: BasicCRUD<T, ID> ) {

    @GetMapping
    fun findAll() = this.basicCRUD.findAll()

    @GetMapping( "/{id}" )
    fun findById( @PathVariable id: ID ): ResponseEntity<T> {
        val entity = basicCRUD.findById(id)
        return ResponseEntity.status(
            if( entity != null ) HttpStatus.OK else HttpStatus.NO_CONTENT
        ).body(entity)
    }

    @PostMapping
    fun save( @Valid @RequestBody body: T ) = ResponseEntity
        .status( HttpStatus.CREATED )
        .body( this.basicCRUD.save(body) )

    @PutMapping
    fun update( @RequestBody body: T ) = this.basicCRUD.update(body)

    @DeleteMapping( "/{id}" )
    fun deleteById( @PathVariable id: ID ) = this.basicCRUD.deleteById(id)
}