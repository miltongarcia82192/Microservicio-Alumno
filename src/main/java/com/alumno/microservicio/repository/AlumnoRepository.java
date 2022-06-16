package com.alumno.microservicio.repository;


import com.alumno.microservicio.model.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends CrudRepository <Alumno, Long>{

}
