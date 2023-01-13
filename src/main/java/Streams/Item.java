package Streams;

import java.math.BigDecimal;

public class Item {

    private String nombre;
    private int cantidad;
    private BigDecimal price;

    public Item(String nombre, int cantidad, BigDecimal price) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.price = price;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", cantidad=").append(cantidad);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
