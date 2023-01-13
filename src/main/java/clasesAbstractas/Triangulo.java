package clasesAbstractas;

public class Triangulo extends Figura implements Color {

    private String color;

    public Triangulo(int numLados, String color) {
        super(numLados);
        this.color = color;
    }

    @Override
    void area() {
        System.out.println("Implementacion de area para una figura de "+this.numLados+" lados");
    }


    @Override
    public String getColor() {
        return this.color;
    }
}
