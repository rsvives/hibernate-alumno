package org.example.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "cuentas_twitter")
public class Cuenta_twitter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuenta")
    private int id_cuenta;

    @Column(name = "nombre",length = 30)
    private  String nombre;

    @Column(name = "nick", length = 30)
    private String nick;

    @Column(name = "f_creacion")
    private LocalDate f_creacion;

    @ManyToOne
    @JoinColumn(name = "id_alumno")
    private Alumno alumno;

    public Cuenta_twitter() {
    }

    public Cuenta_twitter(int id_cuenta, String nombre, String nick, LocalDate f_creacion, Alumno alumno) {
        this.id_cuenta = id_cuenta;
        this.nombre = nombre;
        this.nick = nick;
        this.f_creacion = f_creacion;
        this.alumno = alumno;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public LocalDate getF_creacion() {
        return f_creacion;
    }

    public void setF_creacion(LocalDate f_creacion) {
        this.f_creacion = f_creacion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
