package clasesAnonimas;

import Predicates.Alumno;

import java.util.*;

public class OrdenarLista {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();

        miLista.add("azul");
        miLista.add("negro");
        miLista.add("verde");
        miLista.add("negro");
        miLista.add("blanco");

        /*
        Comparator comparador = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(miLista, comparador);

         */

        /*
        // java < 8
        Collections.sort(miLista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

         */


        //miLista.sort((obj1, obj2)-> obj2.compareTo(obj1));


        /*
        miLista.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });




        for (String item : miLista) {
            System.out.println("item -> " + item);
        }
        */

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("juan", "perez", 20, "M", 15));
        alumnos.add(new Alumno("maria", "perez", 29, "F", 19));
        alumnos.add(new Alumno("kevin", "cueva", 21, "M", 20));
        alumnos.add(new Alumno("luis", "huaman", 25, "M", 17));
        alumnos.add(new Alumno("jorge", "melgar", 23, "M", 14));
        alumnos.add(new Alumno("jose", "matos", 26, "M", 18));

        //Collections.sort(alumnos, (a1, a2)-> a1.getEdad().compareTo(a2.getEdad()));
        //Collections.sort(alumnos, OrdenarLista::comparador);

        alumnos.sort(OrdenarLista::comparador);

        for(Alumno al : alumnos){
            System.out.println(al);
        }
    }

    public static int comparador(Alumno a1, Alumno a2) {
        return a1.getNota().compareTo(a2.getNota());
    }

}
