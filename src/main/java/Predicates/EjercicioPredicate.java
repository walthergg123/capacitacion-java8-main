package Predicates;

import java.util.Scanner;
import java.util.function.Predicate;

public class EjercicioPredicate {
    public static void main(String[] args) {

        String usuarioBD = "kevin";
        String passwordBD = "kevin123";

        Scanner in = new Scanner(System.in);

        System.out.println("ingrese su usuario y contraseña");
        System.out.println("ingrese usuari:");
        String usuario =  in.next();
        System.out.println("ingrese contraseña:");
        String contra =  in.next();

        Predicate<String> evaluaUsuario = usu -> usu.equalsIgnoreCase(usuarioBD);
        Predicate<String> evaluaContra = con -> con.equals(passwordBD);

        Predicate<String> evaluaContrayUsu = evaluaUsuario.and(evaluaContra);

        if( evaluaUsuario.test(usuario) && evaluaContra.test(contra)){
            System.out.println("usuario valido");
        } else {
            System.out.println("usuario no valido");
        }
    }
}
