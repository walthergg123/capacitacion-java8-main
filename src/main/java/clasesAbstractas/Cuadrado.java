package clasesAbstractas;

public class Cuadrado extends Figura {


    public Cuadrado(int numLados) {
        super(numLados);
    }

    @Override
    void area() {
        System.out.println("Implementacion de area para figura de "+this.numLados+" lados");
    }
}
