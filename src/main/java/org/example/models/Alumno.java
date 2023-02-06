package org.example.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "alumnos")
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_alumno")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="f_nacimiento")
    private LocalDate f_nacimiento;
    @Column(name="nota_media")
    private double notaMedia;
    @Column(name="curso", length = 4)
    private String curso;
    @OneToOne(mappedBy = "alumno")
    private Direccion direccion;

    @OneToMany(mappedBy = "alumno")

    private List<Cuenta_twitter> cuentas_twitter;

    public Alumno(String nombre, LocalDate f_nacimiento, double nota_media, String curso, List<Cuenta_twitter> cuentas_twitter) {
        this.nombre = nombre;
        this.f_nacimiento = f_nacimiento;
        this.notaMedia = nota_media;
        this.curso = curso;
        this.cuentas_twitter = cuentas_twitter;
    }




    public Alumno(){}

    public Alumno(String nombre, LocalDate f_nacimiento, double nota_media, String curso) {

        this.nombre = nombre;
        this.f_nacimiento = f_nacimiento;
        this.notaMedia = nota_media;
        this.curso = curso;
    }
    public Alumno(int id, String nombre, LocalDate f_nacimiento, double nota_media, String curso, Direccion dir) {
        this.id = id;
        this.nombre = nombre;
        this.f_nacimiento = f_nacimiento;
        this.notaMedia = nota_media;
        this.curso = curso;
        this.direccion = dir;
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
        return notaMedia;
    }

    public void setNota_media(double nota_media) {
        this.notaMedia = nota_media;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Cuenta_twitter> getCuentas_twitter() {
        return cuentas_twitter;
    }

    public void setCuentas_twitter(List<Cuenta_twitter> cuentas_twitter) {

        this.cuentas_twitter = cuentas_twitter;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", f_nacimiento=" + f_nacimiento +
                ", nota_media=" + notaMedia +
                ", curso='" + curso + '\'' +
                ", direccion=" + direccion +
                ", cuentas_twitter=" + cuentas_twitter +
                '}';
    }
}
