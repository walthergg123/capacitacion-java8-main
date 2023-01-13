package expresionesLambda;

import Predicates.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Genericos {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Jose", "05/04/90", Person.Sex.MALE, "jose.matos@gmail.com"));
        people.add(new Person("Juan", "05/04/91", Person.Sex.MALE, "juan.perez@gmail.com"));
        people.add(new Person("Bruno", "05/04/92", Person.Sex.MALE, "bruno.pinasco@gmail.com"));
        people.add(new Person("Carlos", "05/04/93", Person.Sex.MALE, "calos.huaman@gmail.com"));
        people.add(new Person("Daniel", "05/04/94", Person.Sex.MALE, "daniel.cardenas@gmail.com"));
        people.add(new Person("Maria", "05/04/94", Person.Sex.FEMALE, "maria.duran@gmail.com"));
        people.add(new Person("Rosa", "05/04/94", Person.Sex.FEMALE, "rosa.garcia@gmail.com"));


        Predicate<Person> personPredicate = person -> person.getGender().equals(Person.Sex.FEMALE);
        Predicate<Alumno> alumnoPredicate = person -> person.getNota() > 11;

        Consumer<String> personConsumer = (p) -> System.out.println(p);

        Function<Person, String> personFunction = (p) -> p.getName() + " - "+ p.getBirthday();

        Supplier<Person> personSupplier = () -> new Person("Rosa", "05/04/94", Person.Sex.FEMALE, "rosa.garcia@gmail.com");

        //no generico
        //processPersonsWithFunction(people, personPredicate, personFunction, personConsumer);


        //generico
        processElements(people, personPredicate, personFunction, personConsumer);
    }

    public static void processPersonsWithFunction(
            List<Person> roster,
            Predicate<Person> tester,
            Function<Person, String> mapper,
            Consumer<String> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    public static <X, Y> void processElements(
            Iterable<X> source,
            Predicate<X> tester,
            Function<X, Y> mapper,
            Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
}
