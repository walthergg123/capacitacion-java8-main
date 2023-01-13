package expresionesLambda;

import Predicates.Alumno;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Agregaciones {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Jose", "05/04/90", Person.Sex.MALE, "jose.matos@gmail.com"));
        people.add(new Person("Juan", "05/04/91", Person.Sex.MALE, "juan.perez@gmail.com"));
        people.add(new Person("Bruno", "05/04/92", Person.Sex.MALE, "bruno.pinasco@gmail.com"));
        people.add(new Person("Carlos", "05/04/93", Person.Sex.MALE, "calos.huaman@gmail.com"));
        people.add(new Person("Daniel", "05/04/94", Person.Sex.MALE, "daniel.cardenas@gmail.com"));
        people.add(new Person("Maria", "05/04/94", Person.Sex.FEMALE, "maria.duran@gmail.com"));
        people.add(new Person("Rosa", "05/04/94", Person.Sex.FEMALE, "rosa.garcia@gmail.com"));

        //printPeople(people);

        Predicate<Person> filtra = (p) ->  p.getGender().equals(Person.Sex.FEMALE);

        people.stream()
                .filter((p) ->  p.getGender().equals(Person.Sex.FEMALE))
                .map(persona -> {
                    Integer res = 0;
                    try{
                        int cero = 0;
                        res = 1 /cero;
                    }catch ( Exception e) {
                        //System.out.println(e);
                    }
                    //logica
                    return res;
                });
                //.peek((p) -> p.setName("hola"))
                //.forEach(p -> System.out.println(p));

        Map<String, String> lista2 = people.stream()
                .filter((p) ->  p.getGender().equals(Person.Sex.MALE))
                .limit(3)
                .sorted((per, per1) -> per.getName().compareTo(per1.getName()))
                .collect(Collectors.toMap((person -> person.getName()), (val -> val.getGender().name())));
                //.forEach(person -> System.out.println(person));

        //System.out.println(lista2);

        Set<String> claves = lista2.keySet();
        //lista2.values().forEach(val-> System.out.println(val));
        //claves.stream().forEach(cl-> System.out.println(cl));



        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        Integer res =  numeros.stream().reduce(0, (n1, n2) -> n1+n2);
        System.out.println(res);
    }

    static void printPeople(List<Person> people) {
        people.stream()
                .filter((person) ->  person.getGender().equals(Person.Sex.FEMALE))
                .map(per -> per.getName());
                //.forEach((p) -> System.out.println(p));
    }
}
