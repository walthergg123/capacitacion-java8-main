package clasesAnonimas;

// Programa Java para ilustrar el funcionamiento
// de las clases internas locales
//Clase externa
public class ClaseExterna {
    private void getValor() {
        //Tenga en cuenta que la variable local (suma) debe ser final --hasta JDK 7
        // por lo tanto, este código solo funcionará en JDK 8
        int suma = 20;
        //Método dentro de clase interna interna
        class Interna {
            private int divisor;
            private int resto;

            public Interna() {
                divisor = 4;
                resto = suma & divisor;
            }

            private int getDivisor() {
                return divisor;
            }

            private int getResto() {
                return suma % divisor;
            }

            private int getCociente() {
                System.out.println("Dentro de la clase local.");
                return suma / divisor;
            }
        }
        Interna interna = new Interna();
        System.out.println("Divisor: " + interna.getDivisor());
        System.out.println("Resto: " + interna.getResto());
        System.out.println("Cociente: " + interna.getCociente());
    }

    public static void main(String[] args) {
        ClaseExterna externa = new ClaseExterna();
        externa.getValor();
    }
}

