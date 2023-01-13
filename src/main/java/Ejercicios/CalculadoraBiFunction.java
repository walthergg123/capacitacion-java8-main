package Ejercicios;

import java.util.Scanner;
import java.util.function.*;

public class CalculadoraBiFunction {
    static class Operandos {
        private int n1;
        private int n2;

        public Operandos(int n1, int n2) {
            this.n1 = n1;
            this.n2 = n2;
        }

        public int getN1() {
            return n1;
        }

        public int getN2() {
            return n2;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Calculadora!!");
        System.out.println("ingrese el primer valor:");
        String numero1 = in.next();
        System.out.println("ingrese el segundo valor:");
        String numero2 = in.next();
        System.out.println("ingrese la operacion:");
        String op = in.next();

        Supplier<Operandos> operandosSupplier = () -> {
            int a = Integer.parseInt(numero1);
            int b = Integer.parseInt(numero2);
            return new Operandos(a,b);
        };

        //Integer n1 = 10; // primitivo -> Objeto

        //Double n3 = 10.0;

        //int n2 = 5;
        //primitivo -> wrapper : Autoboxing
        //wrapper -> primitivo : Autounboxing

        //Integer res= n1 + n2;// -> int -> new Integer(res)
        //objeto + primitivo -> Clase Alumno + 5


        IntBinaryOperator suma = (n1, n2) -> n1 + n2;
        IntBinaryOperator resta = (n1, n2) -> n1 - n2;

        BiConsumer<Operandos, String> ejecutaOperacion = (operandos, operacion) -> {
            Integer res = null;
            switch (operacion) {
                case "+":
                    res = suma.applyAsInt(operandos.getN1(), operandos.getN2());
                    break;
                case "-":
                    res = resta.applyAsInt(operandos.getN1(), operandos.getN2());
                default:
                    System.out.println("operacion no soportada");
            }

            if(res != null){
                System.out.println("el resultado es: " + res);
            }
        };

        ejecutaOperacion.accept(operandosSupplier.get(), op);
    }
}
