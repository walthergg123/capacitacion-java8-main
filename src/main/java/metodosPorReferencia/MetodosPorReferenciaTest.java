package metodosPorReferencia;

import java.util.Arrays;
import java.util.Comparator;

public class MetodosPorReferenciaTest {
    public static void metodoEstatico() {
        System.out.println("Metodo estatico de la Clase");
    }

    public void metodoDeInstancia() {
        System.out.println("Metodo de instancia");
    }

    public void otroMetodoDeInstancia(String valor) {
        System.out.println("alguna otra logica" + valor);
    }

    public static void main(String args[]) {


        Referencia referencia = () -> {
            System.out.println("Metodo de instancia");
        };

        //referencia.metodoReferenciado();

        //Referencia a un método de una instancia:
        MetodosPorReferenciaTest t = new MetodosPorReferenciaTest();
        Referencia ref = t::metodoDeInstancia;//implementando el metodo en Interfaz
        //ref.metodoReferenciado();//invocando metodo



        //Referencia a un método estático:
        Referencia ref1 = MetodosPorReferenciaTest::metodoEstatico;
        //ref1.metodoReferenciado();


        Comparator<String> comparador = (s1, s2) -> s1.compareTo(s2);

        //Referencia a un método de instancia de un objeto arbitrario de un tipo particular: String

        String str[] = {"pink", "orange", "black", "red"};
        //Arrays.sort(str, (s1, s2) -> s1.compareTo(s2));
        Arrays.sort(str, String::compareTo);//(s1, s2) -> s1.compareTo(s2);
       // Arrays.sort(str, (s1, s2) -> s1.compareToIgnoreCase(s2));//


        /*
        for (String str1 : str) {
            System.out.println(str1);
        }


         */


        //Referencia a un constructor:

        NotaInterface nota3 = (cod, nota) -> new Nota(cod, nota); //lambda
        NotaInterface nota2= MetodosPorReferenciaTest::crearNota;//metdo por referencia estatico

        NotaInterface nota = Nota::new; // constructor

        //System.out.println(nota2.crearNota("123123", 20));
        //System.out.println(nota3.crearNota("222222", 18));
        System.out.println(nota.crearNota("111111", 11));

    }

    public static Nota crearNota(String codigo, Integer nota){
        return new Nota(codigo, nota);
    }
}
