package com.alumno.microservicio.controller;

//uso del controlador en sprintboot


import com.alumno.microservicio.model.Alumno;
import com.alumno.microservicio.service.AlumnoServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlumnoController {

    @Autowired
    private AlumnoServiceImplement service;

    @PostMapping(value = "/save")
    public ResponseEntity<?> guardarAlumno(@RequestBody Alumno alumno){
        return new ResponseEntity<>(service.saveAlumno(alumno), HttpStatus.CREATED);
    }

    @GetMapping(value = "/search/id/{id}")
    public ResponseEntity<?>buscarAlumno(@PathVariable("id") Long id){
        return new ResponseEntity<>(service.searchById(id), HttpStatus.FOUND);
    }

    @PutMapping(value = "/update/id/{id}")
    public ResponseEntity<?> buscarAlumno (@PathVariable ("id") Long id, @RequestBody Alumno alumno){
        return new ResponseEntity<>(service.updateAlumno(alumno, id),  HttpStatus.OK);
    }

    @DeleteMapping(value = "/erase")
    public ResponseEntity<?> borrarAlumno (@RequestBody Alumno alumno){
        service.deleteAlumno(alumno);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
