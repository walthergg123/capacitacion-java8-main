package clasesAnidadas;

public class ClaseInternaTest {
    public static void main(String[] args) {
        Externa externa=new Externa();
        Externa.Interna interna=externa.new Interna();
        interna.imprimir();
        externa.imprimir();
    }
}
