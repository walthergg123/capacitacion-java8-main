package Supliers;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class GenerarCredenciales {
    public static void main(String[] args) {

        String nombre = "kevin";
        String apellidos ="cueva";
        Integer telefono = 21312313;

        Supplier<String> genContra = () -> {
          String contra = "asd"+123+"@";
          return contra;
        };

        Supplier<String> genUsuario = () -> {

            String cuenta = nombre+"."+apellidos+"@aws.com";
            return cuenta;
        };

        Consumer<String> mostrarUsuario= correo -> System.out.println("correo generado: "+ correo);
        Consumer<String> mostrarContrasenia= pass -> System.out.println("Contraseña generada: "+ pass);

        mostrarUsuario.accept(genUsuario.get());
        mostrarContrasenia.accept(genContra.get());

    }
}
