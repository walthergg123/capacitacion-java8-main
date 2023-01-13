package unaryAndBinaryOperator;

import Predicates.Alumno;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorTest {

    public static void main(String[] args) {
        BinaryOperator<String> concatena = (s1, s2) -> s1.concat(s2);
        Alumno alumnoTarget1 = new Alumno(
                "maria",
                "perez",
                29,
                "F",
                20);
        Alumno alumnoTarget2 = new Alumno(
                "maria",
                "perez",
                29,
                "F",
                19);
        String re = concatena.apply("hola ", "mundo");

        System.out.println(re);

        Comparator<String> stringComparator = (s1, s2) -> s1.compareTo(s2);
        Comparator<Alumno> alumnoComparator = (a1, a2) -> a1.getNota().compareTo(a2.getNota());

        String mayor = BinaryOperator.maxBy(stringComparator).apply("aaa", "zzz");
        String menor = BinaryOperator.minBy(stringComparator).apply("aaa", "zzz");

        Alumno res = BinaryOperator.minBy(alumnoComparator).apply(alumnoTarget1, alumnoTarget2);

        System.out.println(res);

        System.out.println(mayor);
        System.out.println(menor);

        UnaryOperator<Alumno> unaryOperator = (alumno) -> {
            alumno.setNota(10);
            alumno.setApellidos("algo");
            //logica
            return alumno;
        };

        BinaryOperator<Alumno> binaryOperator = (alumno2 , alumno3) -> {
            //logica
            return alumno2;
        };

        unaryOperator.apply(alumnoTarget1);
        binaryOperator.apply(alumnoTarget1, alumnoTarget1);

    }
}
