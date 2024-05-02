package com.jleon.junit.springboot.junit.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nombre;
    private String apellido;
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

}
