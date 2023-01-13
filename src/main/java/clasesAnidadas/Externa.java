package clasesAnidadas;

public class Externa {

    public class Interna {
        public void imprimir() {
            System.out.println("Clase interna");
        }
    }

    public void imprimir() {
        System.out.println("Clase externa");
    }
}
