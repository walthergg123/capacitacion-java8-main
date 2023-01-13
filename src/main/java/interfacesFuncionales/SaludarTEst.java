package interfacesFuncionales;


import expresionesLambda.Person;

public class SaludarTEst implements Saludar {

    public static void main(String[] args) {

        SaludarTEst saludarTEst = new SaludarTEst();
        saludarTEst.numeroMas1();
        Saludar.staticMethod();
    }

    @Override
    public String mensaje(String nombre) {
        return null;

    }

    @Override
    public String responderSaludo(String mensaje) {
        return null;
    }


    @Override
    public boolean test(Person p) {
        return false;
    }
}
