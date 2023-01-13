package Functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplicaPor10 = s -> new Integer(s.intValue() * 10); // int

        Function<Integer, Integer> alCuadrado = s -> s * s;

        //Function<Integer, Integer> alCubo = s -> s * s * s;

        Function<Double, Double> alCubo = s -> s * s * s;

        BiFunction<Double, Double, Double> elevaAl = (numero, expo)-> Math.pow(numero, expo);

        Double resultado = elevaAl.apply(15.0, 3.0);

        //System.out.println(resultado);

        int numero = multiplicaPor10.apply(new Integer(10)).intValue();


        int num2 = multiplicaPor10.apply(10); //10 -> new Integer(10);

        Double potencia = elevaAl.andThen(alCubo).apply(10.0, 2.0);
        System.out.println(potencia);
    }
}
