package clases;
import java.util.ArrayList;

//clase ListaDepartamentos()
public class ListaDepartamentos {

    //atributo
    private ArrayList <Departamento> listaDepartamentos;

    //constructor
    public ListaDepartamentos(){
        listaDepartamentos = new ArrayList<>();
    }

    //metodo para añadir un departamento a la lista
    public void anadirDepartamento(Departamento departamento){
        listaDepartamentos.add(departamento);
    }

    //metodo para eliminar un departamento de la lista
    public void eliminarDepartamento(Departamento departamento){
        listaDepartamentos.remove(departamento);
    }

    //metodo para saber si esta vacia
    public boolean estaVacia(ArrayList<Departamento> listaDepartamentos){
        if(listaDepartamentos.size()== 0){
            return true;
        }else{
            return false;
        }
    }
}
