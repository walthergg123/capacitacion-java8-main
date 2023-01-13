package Supliers;

import Predicates.Alumno;

import java.util.function.*;

public class SupliersTest {
    public static void main(String[] args) {
        Supplier<Alumno> supplier = () -> new Alumno("Jose", "Matos", 25, "F", 18);

        Supplier<String> supplierContra = () -> {
        //8 longitud
        //simbolos especiales
        //2 numeros
            return "";
        };

        String contra = supplierContra.get();

        Alumno alumno = supplier.get();
        Alumno alumno2 = new Alumno("Jose", "Matos", 25, "F", 18);
        System.out.println(alumno);


         //IntBinaryOperator multiplicar = (i,s) -> i*s;
        //ObjIntConsumer<Alumno> alumnoObjIntConsumer = (a, num) -> a.setNota(num);
    }
}
