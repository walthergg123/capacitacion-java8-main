package expresionesLambda;

import java.util.ArrayList;
import java.util.List;
import java.lang.Enum;
import java.util.function.Predicate;

public class InterfacesFuncionalesEstandar {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Jose", "05/04/90", Person.Sex.MALE, "jose.matos@gmail.com"));
        people.add(new Person("Juan", "05/04/91", Person.Sex.MALE, "juan.perez@gmail.com"));
        people.add(new Person("Bruno", "05/04/92", Person.Sex.MALE, "bruno.pinasco@gmail.com"));
        people.add(new Person("Carlos", "05/04/93", Person.Sex.MALE, "calos.huaman@gmail.com"));
        people.add(new Person("Daniel", "05/04/94", Person.Sex.MALE, "daniel.cardenas@gmail.com"));
        people.add(new Person("Maria", "05/04/94", Person.Sex.FEMALE, "maria.duran@gmail.com"));
        people.add(new Person("Rosa", "05/04/94", Person.Sex.FEMALE, "rosa.garcia@gmail.com"));
        people.add(new Person("Norma", "05/04/94", Person.Sex.FEMALE, "norma.vargas@gmail.com"));

        Predicate<Person> predicado = (Person p) -> p.getName().equals("Jose");
        Predicate<Person> predicado1 = (Person p) -> p.getName().toLowerCase().contains("n") && p.getGender().equals(Person.Sex.FEMALE);

        printPerson(people, predicado1);

    }

    public static void printPerson(List<Person> people, Predicate<Person> tester) {
        for (Person person : people) {
            if(tester.test(person)){
                System.out.println(person);
            }
        }
    }
}
