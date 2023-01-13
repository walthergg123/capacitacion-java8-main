package Consumers;

import Predicates.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerTest {

    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("juan", "perez", 20, "M", 15));
        alumnos.add(new Alumno("kevin", "cueva", 21, "M", 20));
        alumnos.add(new Alumno("jorge", "melgar", 23, "M", 14));
        alumnos.add(new Alumno("luis", "huaman", 25, "M", 17));
        alumnos.add(new Alumno("jose", "matos", 26, "M", 18));
        alumnos.add(new Alumno("maria", "perez", 29, "F", 19));


        Consumer<Alumno> mostrarAlumno = (Alumno a) -> {
            System.out.println("nombre del alumno " + a.getNombre());
            System.out.println("nota obtenida: "+a.getNota());
        };


        //mostrarAlumno.accept(alumnos.get(0));

        //Consumer<String> test = s -> test(s) ;// { return s};

        Consumer<Alumno> guardarNota = a -> {
            System.out.println("registrando notas de alumno");
            registrarNota(a);
        };

        //guardarNota.accept(alumnos.get(0));

        Alumno nuevoAlumno = new Alumno("Jose", "Jose", 20,"M", 18);
        //mostrarAlumno.accept(nuevoAlumno);

        //izquierda a derecha
        mostrarAlumno.andThen(guardarNota).accept(nuevoAlumno);

        ObjIntConsumer<Alumno> test = (al, nota) -> {
            //logica
            System.out.println(al.getNombre() + " - " + (10+5));
        };

        //test.accept(nuevoAlumno, 10);

    }

    static int registrarNota(Alumno alumno) {
        System.out.println("nota registrada: "+alumno.getNota());
        return 1;
    }

    static void test(String s){
        //logica
        System.out.println(s);
    }
}
