package clases;
import java.util.ArrayList;

public class ListaEmpleados {

    private ArrayList <Empleado> listaEmpleados;

    public ListaEmpleados(){
        listaEmpleados = new ArrayList<>();
    }

    public void anadirEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }

    public boolean estaVacia(ArrayList<Empleado> listaEmpleados){
        if(listaEmpleados.size()== 0){
            return true;
        }else{
            return false;
        }
    }
}
