package clasesAnonimas;

import java.util.Comparator;

public class CalculadoraTest{

    static private String nombre = "Jose";

    public static void main(String[] args) {
        CalculadoraTest calculadoraTest = new CalculadoraTest();
        Calculadora cal = new Calculadora(10,3);
        Calculadora cal2 = new Calculadora(20,30);

        Calcular calcula = new Calcular() {
            @Override
            public double sumar(Calculadora operandos) {
                return operandos.getNumero1() + operandos.getNumero2();
            }
        };

        CalcularImpl calcularImp = new CalcularImpl();
        double res2 = calcularImp.sumar(cal2);


        String cadena ="hola";

        Calcular calcularL = (Calculadora o) -> {
            return o.getNumero2() + o.getNumero1();
        };



        Calcular c = n -> n.getNumero1() + n.getNumero2();

        calcularL.sumar(cal2);


        /*
        double res3 = calculadoraTest.sumar(cal);
        CalculadoraTest.sumar1(cal2);

         */

        double res =  calcula.sumar(cal);
        System.out.println("la suma es: "+res);
        System.out.println("la suma es: "+res2);
        //System.out.println("la suma es: "+res3);
    }

    //@Override
    static double sumar1(Calculadora numeros) {
        nombre = "Jose";
        return numeros.getNumero1()+numeros.getNumero2();
    }

    /*
    @Override
    double sumar(Calculadora numeros) {
        return 0;
    }

     */
}
