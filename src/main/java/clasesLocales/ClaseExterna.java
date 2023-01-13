package clasesLocales;

class ClaseExterna {
    public int dato = 10;

    public int getDato() {
        return dato;
    }


    public static void main(String[] args) {
        ClaseExterna externa = new ClaseExterna();
        if (externa.getDato() < 20) {
            // Clase interna local dentro de la cláusula if
            class Interna {
                public int getValor() {
                    System.out.println("Dentro de la clase interna.");
                    return externa.dato;
                }
            }
            Interna interna = new Interna();
            System.out.println(interna.getValor());
        } else {
            System.out.println("Dentro de la clase externa.");
        }
    }
}
