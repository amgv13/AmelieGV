import java.util.ArrayList;

class Empleados{

    private ArrayList<Empleado> lista = new ArrayList<>();

    /**
     * Pinta todos los empleados de la lista
     */
    public void listarEmpleados(){

        System.out.println(StringsUsed.LISTA_EMPLEADOS);

        for (Empleado empleado : this.lista) {
            System.out.println(empleado);
        }

    }

    /**
     * Cambia el salario de todos los empleados de la lista aplicándoles el aumento
     * @param porcentaje
     */
    public void aumentarSalario(double porcentaje) {

        for (Empleado empleado : this.lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Añade a la lista los empleados pasados por parámetro
     * @param empleados
     */
    public void darDeAlta(ArrayList<Empleado> empleados){
        this.lista.addAll(empleados);
    }
    
}

