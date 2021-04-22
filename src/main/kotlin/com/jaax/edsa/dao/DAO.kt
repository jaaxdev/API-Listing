package com.jaax.edsa.dao

import com.jaax.edsa.entities.UsuarioGlobal
import com.jaax.edsa.entities.student.Alumno
import com.jaax.edsa.entities.birthday.BirthdayPersona
import com.jaax.edsa.entities.edsa.Cuenta
import com.jaax.edsa.entities.edsa.Email
import com.jaax.edsa.entities.shopping.Producto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioGlobalDAO: JpaRepository<UsuarioGlobal, String>

@Repository
interface EmailDAO: JpaRepository<Email, String>

@Repository
interface CuentaDAO: JpaRepository<Cuenta, String>

@Repository
interface BirthdayDAO: JpaRepository<BirthdayPersona, String>

@Repository
interface AlumnoDAO: JpaRepository<Alumno, Int>

@Repository
interface ProductoDAO: JpaRepository<Producto, String>