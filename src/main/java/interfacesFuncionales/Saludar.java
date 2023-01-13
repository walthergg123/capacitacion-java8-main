package interfacesFuncionales;


import expresionesLambda.CheckPerson;


public interface Saludar extends CheckPerson {

    abstract  String mensaje(String nombre);

    abstract String responderSaludo(String mensaje);

    default void numeroMas1() {
        System.out.println("desde interface metodo numeroMas1");
    }

    static  void staticMethod() {
        System.out.println("desde metodo estatico");
    }

}
