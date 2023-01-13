package Predicates;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class EjercicioFunction {

    public static void main(String[] args) {

        String usuario = "KEVIN";
        String contrasenia = "kevin123";

        Scanner in = new Scanner(System.in);
        System.out.println("ingrese su usuario y contraseña");
        System.out.println("usuario :");
        String usuarioIngresado =  in.next();
        System.out.println("contraseña :");
        String contraIngresada =  in.next();
        System.out.println("validando...");

        Function<String, String> transformaUsername = s -> s.toUpperCase();
        Predicate<String> usuarioValido = s -> s.equals(usuario);
        Predicate<String> contraseniaValida = s-> s.equals(contrasenia);

        if (usuarioValido.test(transformaUsername.apply(usuarioIngresado)) && contraseniaValida.test(contraIngresada)) {
            System.out.println("usuario valido: " + usuarioIngresado);
        }else {
            System.out.println("usuario no valido");
        }

    }
}
