package clases;
import java.util.ArrayList;

//clase ListaEmpleados()
public class ListaEmpleados {

    //atributo
    private ArrayList <Empleado> listaEmpleados;

    //constructor
    public ListaEmpleados(){
        listaEmpleados = new ArrayList<>();
    }

    //metodo para anadir un empleado a la lista
    public void anadirEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    //metodo para eliminar un empleado de la lista
    public void eliminarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }

    //metodo para saber si la lista esta vacia
    public boolean estaVacia(ArrayList<Empleado> listaEmpleados){
        if(listaEmpleados.size()== 0){
            return true;
        }else{
            return false;
        }
    }
}
