package Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class TestBiPredicate {

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("juan", "perez", 20, "M", 15));
        alumnos.add(new Alumno("kevin", "cueva", 15, "M", 20));
        alumnos.add(new Alumno("jorge", "melgar", 23, "M", 14));
        alumnos.add(new Alumno("luis", "huaman", 25, "M", 17));
        alumnos.add(new Alumno("jose", "matos", 26, "M", 18));
        alumnos.add(new Alumno("maria", "perez", 29, "F", 19));

        Predicate<Alumno> edadMayorA = alumno -> alumno.getEdad() > 25;
        Predicate<Alumno> edadMayorA1 = alumno -> alumno.getEdad() > 20;
        Predicate<Alumno> notaMayorA = alumno -> alumno.getNota() > 15;
        Predicate<Alumno> notaMenor = alumno -> alumno.getNota() < 15;

        BiPredicate<Alumno,Integer> alumnoConNotaMayorA = (alumno, nota) -> alumno.getNota() > nota;
        BiPredicate<Alumno,Integer> alumnoConEdadMayorA = (alumno, edad) -> alumno.getEdad() > edad;

       // IntPredicate intPredicate = (valorInt) -> valorInt % 2 = 0;

        boolean res=  alumnoConNotaMayorA.test(alumnos.get(0), 16);
        filtrarAlumnos(alumnoConNotaMayorA, 18, alumnos);
        //System.out.println(res);

        //filtrarAlumnos(alumnoConNotaMayorA.or(alumnoConEdadMayorA),17, alumnos);

    }

    static void filtrarAlumnos(BiPredicate<Alumno, Integer> tester,Integer nota, List<Alumno> alumnoList) {
        for (Alumno alumno : alumnoList) {
            if (tester.test(alumno, nota)) {
                System.out.println("alumno : " + alumno);
            }
        }
    }
}
