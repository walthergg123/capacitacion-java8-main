package expresionesLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ExpresionesLambda {


    interface Test {
        boolean tester(Person p);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Jose", "05/04/90", Person.Sex.MALE, "jose.matos@gmail.com"));
        people.add(new Person("Juan", "05/04/91", Person.Sex.MALE, "juan.perez@gmail.com"));
        people.add(new Person("Bruno", "05/04/92", Person.Sex.MALE, "bruno.pinasco@gmail.com"));
        people.add(new Person("Carlos", "05/04/93", Person.Sex.MALE, "calos.huaman@gmail.com"));
        people.add(new Person("Daniel", "05/04/94", Person.Sex.MALE, "daniel.cardenas@gmail.com"));
        people.add(new Person("Maria", "05/04/94", Person.Sex.FEMALE, "maria.duran@gmail.com"));
        people.add(new Person("Rosa", "05/04/94", Person.Sex.FEMALE, "rosa.garcia@gmail.com"));

        CheckPerson checkPerson = new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getGender().equals(Person.Sex.MALE);
            }
        };

        Predicate<Person> predicate =  (persona)-> persona.getGender().equals(Person.Sex.MALE);

        printPersonPredicate(people, predicate);
        //printPerson(people, checkPerson);

        CheckPerson checkPersonLambda = (Person person) -> person.getGender().equals(Person.Sex.FEMALE);
        CheckPerson checkPersonLambda1 = (Person person) -> person.getName().contains("n");

        boolean res =  checkPersonLambda.test(people.get(0));
        System.out.println(res);

        //printPerson(people, checkPersonLambda);
        //printPerson(people, checkPersonLambda1);

        //Test testLocal = person ->  person.getName().contains("n");

        //findPerson(people, testLocal);

    }

    public static void printPerson(List<Person> people, CheckPerson tester) {
        for (Person person : people) {
            if(tester.test(person)){
                System.out.println(person);
            }
        }
    }

    public static void printPersonPredicate(List<Person> people, Predicate<Person> tester) {
        for (Person person : people) {
            if(tester.test(person)){
                System.out.println(person);
            }
        }
    }

    public static void findPerson(List<Person> people, Test test) {
        for (Person person : people) {
            if(test.tester(person)){
                System.out.println(person);
            }
        }
    }
}
