package expresionesLambda;

public interface CheckPerson {

    boolean test(Person p);

    static boolean test1(Person p){
        return true;
    }
}