package com.alumno.microservicio.service;

import com.alumno.microservicio.model.Alumno;

public interface AlumnoServiceInterface {

    public Alumno saveAlumno(Alumno alumno);
    public Alumno searchById(Long id);
    public void deleteAlumno(Alumno alumno);
    public Alumno updateAlumno(Alumno alumno, Long id);
}
