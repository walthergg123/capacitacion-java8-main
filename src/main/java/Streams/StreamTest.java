package Streams;

import Predicates.Alumno;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("juan", "perez", 20, "M", 18));
        alumnos.add(new Alumno("kevin", "cueva", 21, "M", 18));
        alumnos.add(new Alumno("jorge", "melgar", 23, "M", 17));
        alumnos.add(new Alumno("luis", "huaman", 25, "M", 17));
        alumnos.add(new Alumno("jose", "matos", 26, "M", 18));
        alumnos.add(new Alumno("maria", "perez", 29, "F", 18));
        //alumnos.add(new Alumno("maria", "perez", 29, "F", 18));

        Function<Alumno, Integer> obtenerNombre = (alumno)->{
            //operacion
            //System.out.println("dentro de la expresion lambda de function");
            return alumno.getNota();
        };

        Map<String,Alumno > s =  alumnos.stream()
                //.peek(c -> System.out.println(c))
                .filter(a-> a.getNota()> 15) //[kevin, luis, jose, maria]
                //.map(obtenerNombre)
                .limit(3)
                .collect(Collectors.toMap(Alumno::getNombre,Function.identity()));


                //.forEach(i-> System.out.println(i));
        //alumnos.stream().map(Alumno::getNombre).forEach(i-> System.out.println(i));

        //s.keySet().forEach(System.out::println);
        //s.values().forEach(System.out::println);

        //s.entrySet().forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));

        alumnos.stream()
                .filter(a-> a.getNota()> 15) //[kevin, luis, jose, maria]
                .map(obtenerNombre);
                //.forEach(i-> System.out.println(i));

        long tamaño = alumnos.stream().count();
        //System.out.println(tamaño);


        Optional<Alumno> al1 = alumnos.stream().findFirst();
        //System.out.println(al1.isPresent() ? al1: "no esta presente");

        boolean esmayor= alumnos.stream().anyMatch(alumno -> alumno.getNota()> 16);

        Optional<Alumno> any = alumnos.stream().findAny();
        System.out.println(any.isPresent() ? any: "no esta presente");

        //System.out.println(esmayor);

        String cadena = null;
        Optional<String> myvar = Optional.ofNullable(cadena);
        //myvar.get();

        //String str= myvar.orElse("hola");
        //System.out.println(myvar.get());
        //System.out.println(myvar.isPresent() ? myvar.get(): "no esta");
        //System.out.println(str);

        /*
        s.filter(a-> a.getNota()> 15) //[kevin, luis, jose, maria]
                .map(obtenerNombre);

        s.close();
         */





        /*
        double promedio = alumnos.stream().collect(Collectors.averagingInt(alu-> alu.getNota()));
        Optional<Alumno> alumno = alumnos.stream().min(Comparator.comparing(a -> a.getEdad()));
        System.out.println(alumno.get());
        System.out.println(promedio);
         */
    }
}
