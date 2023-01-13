package Principios;

public class Arquero extends Seleccion {


    private String estatura;

    private Arquero(String nombre, String apellido, String fechaNac, String estatura) {
        super();
        //super(nombre, apellido, fechaNac);
        this.estatura = estatura;
    }

    public Arquero getIntancia(String nombre, String apellido, String fechaNac, String estatura) {
        return new Arquero(nombre, apellido, fechaNac, estatura);
    }

    public boolean taparPenal() {
        //implementar logica compleja

        //
        System.out.println("penal tapado");
        return true;
    }

    public static void main(String[] args) {
        Arquero arquero = new Arquero("Pedro","Gallece", "05/02/90", "1,90" );
        //arquero.taparPenal();
        //System.out.println("en este momento");

        int numero = 2147483647;
        int numero2 = 1;
        short numero3 = 10;
        float floatNumber = 1000000;

        byte numeroByte = (byte) numero2; //127

        //short numero4 = floatNumber + numero3;

        System.out.println(numero);
        System.out.println(numeroByte);
        //System.out.println(numero4);
    }


}
