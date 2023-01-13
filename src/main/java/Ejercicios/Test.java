package Ejercicios;

import java.awt.font.TextMeasurer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Test {

    public static void main(String[] args) {
        List<Empleado> empleadosList = new ArrayList<>();

        empleadosList.add(new Empleado("kevin", 1025, "sistemas"));
        empleadosList.add(new Empleado("Jorge", 1325, "conta"));
        empleadosList.add(new Empleado("Luis", 2025, "sistemas"));
        empleadosList.add(new Empleado("Jose", 1025, "rrhh"));

        Predicate<Empleado> predicate = empleado -> empleado.getDepartamento().equals("sistemas");
        Predicate<Empleado> predicaterrhh = empleado -> empleado.getDepartamento().equals("rrhh");

        BiPredicate<Empleado, String> predicatedinamic = (empleado, area) -> empleado.getDepartamento().equals(area);

        BiFunction<Empleado, Integer, Empleado> empleadoFunction = (empleado, inc) -> {
            if(predicatedinamic.test(empleado, "rrhh")){
                empleado.setSalario(empleado.getSalario() + inc);
            }
            if(predicatedinamic.test(empleado, "sistemas")){
                empleado.setSalario(empleado.getSalario() + 2000);
            }
            if(predicatedinamic.test(empleado, "conta")){
                empleado.setSalario(empleado.getSalario() + 0);
            }
            return empleado;
        };

        BiConsumer<List<Empleado>, Integer> empleadoConsumer = (empleados,s ) -> {
            for (Empleado empleado : empleados){
                Empleado e = empleadoFunction.apply(empleado, s);
                System.out.println(e);
            }
        };

        empleadoConsumer.accept(empleadosList, 1000);

    }
}
