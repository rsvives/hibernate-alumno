package org.example.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "direcciones")
public class Direccion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_direccion")
    private int id;
    @Column(name="calle", length = 20)
    private String calle;
    @Column(name="cod_postal")
    private int cod_postal;
    @Column(name="ciudad", length = 20)
    private String ciudad;
    @Column(name="pais", length = 20)
    private String pais;
    @OneToOne
    @JoinColumn(name = "id_alumno")
    private Alumno alumno;


    public Direccion(){

    }

    public Direccion(String calle, int cod_postal, String ciudad, String pais){
        setCalle(calle);
        setCod_postal(cod_postal);
        setCiudad(ciudad);
        setPais(pais);
    }

    public Direccion(int id, String calle, int cod_postal, String ciudad, String pais, Alumno alumno) {
        this.id = id;
        this.calle = calle;
        this.cod_postal = cod_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.alumno = alumno;
    }

    public int getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(int cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", calle='" + calle + '\'' +
                ", cod_postal=" + cod_postal +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
