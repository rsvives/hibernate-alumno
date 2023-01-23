package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceUnit;
import org.example.models.Alumno;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;


public class App 
{
    @PersistenceUnit(name = "persistencia")
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
    private static EntityManager manager = emf.createEntityManager();

    public static void main( String[] args )
    {

        Alumno a1= new Alumno(0,"Jose", LocalDate.of(1999,06,15),8.2,"DAW");
        Alumno a2= new Alumno(0,"Marta", LocalDate.of(1999,05,15),8.2,"DAW");

        manager.getTransaction().begin();
            manager.persist(a1);
            manager.persist(a2);
            a2.setNombre("Tizziano");
        manager.getTransaction().commit();
        mostrarTodosLosAlumnos();
        manager.close();

        manager = emf.createEntityManager();
        manager.getTransaction().begin();
            a1 = manager.merge(a1);
            a2 = manager.merge(a2);

            a2.setNota_media(6);
            manager.persist(a2);

            manager.remove(a1);
        manager.getTransaction().commit();
        mostrarTodosLosAlumnos();
        manager.close();

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

}
