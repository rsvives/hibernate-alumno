package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceUnit;
import org.example.models.Alumno;
import org.example.models.Cuenta_twitter;
import org.example.models.Direccion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class App 
{
    @PersistenceUnit(name = "persistencia")
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
    private static EntityManager manager = emf.createEntityManager();

    public static void main( String[] args )
    {

//        Alumno a1= new Alumno(0,"Jose", LocalDate.of(1999,06,15),8.2,"DAW");
//        Alumno a2= new Alumno(0,"Marta", LocalDate.of(1999,05,15),8.2,"DAW");


//        manager.getTransaction().begin();
//
//        manager.persist(d1);
//        d1.setCalle("Gnal Elorza");
//        manager.persist(d2);
//        manager.persist(d3);

//        manager.getTransaction().commit();
        //mostrarTodosLosAlumnos();
//        mostrarDirecciones();
//        manager.close();


//        Alumno miAlumno = manager.find(Alumno.class, 2L);
//        Direccion direccionMiAlumno = miAlumno.getDireccion();
//
//        System.out.println(direccionMiAlumno);

//        Alumno a1 =new Alumno("alumno1",LocalDate.of(2000,10,10),7.9,
//                "2DAM");
//
//        Cuenta_twitter c1 = new Cuenta_twitter("nombreCuenta1","nick1",LocalDate.of(2020,
//                10,10),a1);
//        Cuenta_twitter c2 = new Cuenta_twitter("nombreCuenta2","nick2",LocalDate.of(2022,
//                12,12),a1);
//
//        List<Cuenta_twitter> listaCuentas = new ArrayList<Cuenta_twitter>();
//        listaCuentas.add(c1);
//        listaCuentas.add(c2);
//
//        a1.setCuentas_twitter(listaCuentas);
//
//        manager.getTransaction().begin();
//
//        manager.persist(a1);
//        manager.persist(c1);
//        manager.persist(c2);
//
//        manager.getTransaction().commit();
//        manager.close();
//

        mostrarAlumno(23L);

    }
    public static void mostrarAlumno(Object id){
        Alumno a1 = manager.find(Alumno.class,id);
        System.out.println(a1.toString());
    }
    public static void mostrarTodosLosAlumnos(){
        List<Alumno> todosLosAlumnos = (List<Alumno>) manager.createQuery("FROM Alumno").getResultList();

        for (Alumno alumno : todosLosAlumnos) {
            System.out.println(alumno.toString());
        }
    }

    public static void mostrarDirecciones(){
        List<Direccion> todasLasDirecciones = (List<Direccion>) manager.createQuery("FROM Direccion").getResultList();
        for (Direccion d : todasLasDirecciones) {
            System.out.println(d.toString());
        }
    }

}
