package org.example.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "alumnos")
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="f_nacimiento")
    private LocalDate f_nacimiento;
    @Column(name="nota_media")
    private double nota_media;
    @Column(name="curso", length = 4)
    private String curso;

    public Alumno(){}

    public Alumno(int id, String nombre, LocalDate f_nacimiento, double nota_media, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.f_nacimiento = f_nacimiento;
        this.nota_media = nota_media;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(LocalDate f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public double getNota_media() {
        return nota_media;
    }

    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", f_nacimiento=" + f_nacimiento +
                ", nota_media=" + nota_media +
                ", curso='" + curso + '\'' +
                '}';
    }
}
