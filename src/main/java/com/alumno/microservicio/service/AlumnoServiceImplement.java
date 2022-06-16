package com.alumno.microservicio.service;


import com.alumno.microservicio.model.Alumno;
import com.alumno.microservicio.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImplement implements AlumnoServiceInterface{

    @Autowired
    private AlumnoRepository repository;

    @Override
    public Alumno saveAlumno(Alumno alumno) {
        return repository.save(alumno);
    }

    @Override
    public Alumno searchById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteAlumno(Alumno alumno){
        repository.delete(alumno);
    }

    @Override
    public Alumno updateAlumno(Alumno alumno, Long id){
        Alumno alumno1 = new Alumno();
        alumno1 = repository.findById(id).get();
        alumno1.setId(id);
        alumno1.setNombre(alumno.getNombre());
        alumno1.setApellido(alumno.getApellido());
        alumno1.setDireccion(alumno.getDireccion());
        alumno1.setEmail(alumno.getEmail());
        alumno1.setFechaIngreso(alumno.getFechaIngreso());
        alumno1.setFechaNacimiento(alumno.getFechaNacimiento());
        alumno1.setTelefono(alumno.getTelefono());

        return repository.save(alumno1);
    }


}
