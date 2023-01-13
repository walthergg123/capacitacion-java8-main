package enums;

public enum Colores {
    ROJO("rojo", "R", "color rojo"),
    AZUL("azul", "Az", "cuenta de ahorros");


    private String valor;
    private String descripcion;
    private String acronimo;


    Colores(String valor, String acronimo, String descripcion) {
        this.valor = valor;
        this.acronimo = acronimo;
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public String getAcronimo() {
        return acronimo;
    }

}
