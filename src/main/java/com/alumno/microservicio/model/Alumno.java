package com.alumno.microservicio.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="Alumno")

public class Alumno implements Serializable {
    //reconoce el dato id como principal y luego lo asocia a una columna
    @Id
    @Column(name="dni")
    private long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column (name="ingreso")
    private String fechaIngreso;
    @Column(name="nacimiento")
    private String fechaNacimiento;
    @Column(name="telefono")
    private long telefono;
    @Column
    private String email;
    @Column
    private String direccion;
}
