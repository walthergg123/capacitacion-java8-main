package clasesAbstractas;

public abstract class Figura {
    int numLados;

    public Figura(int numLados) {
        this.numLados = numLados;
    }

    public void OtraFuncionalidad(){
        System.out.println("Otra funcionalidad desde clase abstracta");
    }

    abstract void area();
}
