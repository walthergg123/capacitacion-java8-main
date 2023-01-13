package Predicates;

import java.util.ArrayList;
import java.util.List;

import java.util.function.IntPredicate;

import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("juan", "perez", 20, "M", 15));
        alumnos.add(new Alumno("kevin", "cueva", 21, "M", 20));
        alumnos.add(new Alumno("jorge", "melgar", 23, "M", 14));
        alumnos.add(new Alumno("luis", "huaman", 25, "M", 17));
        alumnos.add(new Alumno("jose", "matos", 26, "M", 18));
        alumnos.add(new Alumno("maria", "perez", 29, "F", 19));

        Predicate<Alumno> edadMayorA = alumno -> alumno.getEdad() > 25;
        Predicate<Alumno> notaMayorA = alumno -> alumno.getNota() > 15;
        Predicate<Alumno> notaMenor = alumno -> alumno.getNota() < 15;


        Predicate<Alumno> predicateEdadMayorA25YNotaMayorA15 = edadMayorA.and(notaMayorA).negate(); // alumno.getEdad() > 25 && alumno.getNota() > 15

        filtrarAlumnos(edadMayorA.and(alumno -> alumno.getNota() > 15).negate(), alumnos);

        //filtrarAlumnos(notaMayorA.or(edadMayorA), alumnos);
        Alumno alumnoTarget = new Alumno("maria", "perez", 29, "F", 19);

       // filtrarAlumnos(Predicate.isEqual(alumnos.get(0)), alumnos);


        //tipos primitivos
        IntPredicate esPar = i -> i % 2 == 0;
        esPar.test(10);

        Predicate<Integer> prueba = i -> i % 2 == 0;


        filtrarAlumnos(predicateEdadMayorA25YNotaMayorA15, alumnos);

    }

    static void filtrarAlumnos(Predicate<Alumno> tester, List<Alumno> alumnoList) {
        for (Alumno alumno : alumnoList) {
            if (tester.test(alumno)) {
                System.out.println("alumno : " + alumno);
            }
        }
    }
}
