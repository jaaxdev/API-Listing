package com.jaax.edsa.controller.student

import com.jaax.edsa.controller.BasicController
import com.jaax.edsa.entities.student.Alumno
import com.jaax.edsa.services.student.AlumnoService
import com.jaax.edsa.utils.Constantes
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping( Constantes.ENDPOINT_STUDENT_ALUMNO )
class AlumnoController( alumnoService: AlumnoService ): BasicController<Alumno, Int>( alumnoService )