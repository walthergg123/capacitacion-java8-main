package clasesAbstractas;

public class TestFigura {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(4);
        cuadrado.area();


        Triangulo triangulo = new Triangulo(3, "verde");
        triangulo.area();



        //String color = triangulo.getColor();
       // System.out.println("el color del la figura es "+ color);
    }
}
