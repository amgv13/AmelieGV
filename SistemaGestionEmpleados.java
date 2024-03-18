import java.util.ArrayList;
import java.util.Scanner;

public class SistemaGestionEmpleados {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("Juan", "Desarrollador", 50000));
        empleados.add(new Empleado("María", "Diseñadora", 45000));
        empleados.add(new Empleado("Pedro", "Gerente", 60000));

        Empleados sistema = new Empleados();
        sistema.darDeAlta(empleados);

        Scanner scanner = new Scanner(System.in);
        System.out.print(StringsUsed.ASK_PERCENT_STRING);
        double porcentaje = scanner.nextDouble();

        sistema.aumentarSalario(porcentaje);
        
        sistema.listarEmpleados();

        scanner.close();
    }
}
