package Ejercicios;

public class Empleado {

    private String nombre;
    private int salario;
    private String departamento;

    public Empleado(String nombre, int salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", salario=").append(salario);
        sb.append(", departamento='").append(departamento).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
