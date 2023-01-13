package clasesAbstractas;

public class TestClaseAbstracta extends ClaseAbstracta{


    public TestClaseAbstracta(int numero) {
        super(numero);
    }

    public static void main(String[] args) {
        TestClaseAbstracta test = new TestClaseAbstracta(10);

        test.mensaje();
        test.metodo2();
        //test.getColor();
    }


    //@Override
    void metodo() {

    }

    @Override
    void mensaje() {
        System.out.println("alguna logica");
    }
}
