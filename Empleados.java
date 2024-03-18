import java.util.ArrayList;

class Empleados{

    private ArrayList<Empleado> lista = new ArrayList<>();

    public void listarEmpleados(){

        System.out.println(StringsUsed.LISTA_EMPLEADOS);

        for (Empleado empleado : this.lista) {
            System.out.println(empleado);
        }

    }

    public void aumentarSalario(double porcentaje) {

        for (Empleado empleado : this.lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void darDeAlta(ArrayList<Empleado> empleados){
        this.lista.addAll(empleados);
    }
    
}

