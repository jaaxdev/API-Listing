package com.jaax.edsa.controller.student

import com.jaax.edsa.controller.BasicController
import com.jaax.edsa.entities.student.Alumno
import com.jaax.edsa.services.student.AlumnoService
import com.jaax.edsa.utils.Constantes
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping( Constantes.ENDPOINT_STUDENT_ALUMNO )
class AlumnoController( alumnoService: AlumnoService ): BasicController<Alumno, String>( alumnoService )