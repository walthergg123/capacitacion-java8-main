package clasesAbstractas;

public abstract class ClaseAbstracta extends OtraClaseAbs {

    int numero;

    public ClaseAbstracta(int numero) {
        this.numero = numero;
    }


    //abstract void metodo();

    void metodo2(){
        //alguna logica
        System.out.println("desde clase abstracta metodo2"+this.numero);
    }

}
