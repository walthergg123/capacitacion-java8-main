package Functions;

import Predicates.Alumno;
import expresionesLambda.Person;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer, Integer> multiplicaPor10 = s -> s * 10;

        Function<Integer, Integer> alCuadrado = (Integer s) -> {
            return s * s;
        };

        Function<Integer, Integer> alCubo = s -> s * s * s;

        Function<Alumno, Person> mapeo =  (Alumno alumno) -> {
            Person person = new Person(
                    alumno.getNombre(),
                    "",
                    Person.Sex.MALE,
                    "");
            return person;
        };

        //Integer res = multiplicaPor10.apply(6);
        //System.out.println(res);

        Alumno alumnoTarget = new Alumno(
                "maria",
                "perez",
                29,
                "F",
                19);

        Person personMapeada = mapeo.apply(alumnoTarget);
        //System.out.println(personMapeada);

        //de derecha a izquierda
        Integer resultado =  multiplicaPor10.compose(alCuadrado).apply(5);

        //de izquierda a derecha
        Integer resultado2 = multiplicaPor10.andThen(alCuadrado).apply(5);

        System.out.println("el resultado es: "+ resultado);

        System.out.println("el resultado de andThen es: " +resultado2);

        //System.out.println(Function.identity().apply(10));


        //Function<int, int> alCuadrado = i -> i*i;
        IntFunction<Integer> integerIntFunction = i -> i +10;

        int n = integerIntFunction.apply(10);

        //UnaryOperator<Alumno> unaryOperator = (alumno) ->  alumno;
        //UnaryOperator.identity();

    }
}
